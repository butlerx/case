#! /usr/bin/env python3

import json
import math
import re
import sys
from urllib.parse import quote
from urllib.request import urlopen


def relevance_weight(query, R):
    url = "http://clueweb.adaptcentre.ie/WebSearcher/search?query=%sg&page=1"\
        % quote(query)
    response = urlopen(url)
    string = str(response.read().decode(
        response.info().get_param('charset') or 'utf-8'))
    string = re.sub('<[^<]+?>', '', string)
    string = re.sub(r'\s+', ' ', string)
    data = json.loads(string)
    total_num_docs = 13719681
    num_for_query = num_of_docs(query)
    results = 0
    del data[-1]
    data = data[:R]
    if data:
        try:
            for json_inner_array in data:
                if json_inner_array[0]["snippet"] is not None:
                    results = results + \
                        count_occurrences(
                            query, json_inner_array[0]["snippet"])
        except Exception as err:
            raise err
    top = (num_for_query + 0.5) * (total_num_docs -
                                   results - R + num_for_query + 0.5)
    bottom = (results - num_for_query + 0.5) * (R - num_for_query + 0.5)
    return math.log(top / bottom)


def num_of_docs(query):
    url = "http://clueweb.adaptcentre.ie/ClueWebDocRead/index.jsp?snippet=%s"
    response = urlopen(url % quote(query))
    string = str(response.read().decode(
        response.info().get_param('charset') or 'utf-8'))
    string = re.sub('<[^<]+?>', '', string)
    string = re.sub('JSP Page', '', string)
    string = re.sub(r'\s+', '', string)
    data = json.loads(string)
    return data[0]


def count_occurrences(word, sentence):
    return sentence.lower().split().count(word)


def main():
    try:
        querys = sys.argv[1].split(",")
        offer_weight = []
        for query in querys:
            data = (query, relevance_weight(query, 5) * num_of_docs(query))
            offer_weight.append(data)
        offer_weight = sorted(offer_weight, key=lambda query: query[1])
        print(offer_weight)
        extended_querys = []
        for o_query in querys:
            for expansion in offer_weight:
                if o_query != expansion[0]:
                    extended_querys.append((o_query + expansion[0]),
                                           relevance_weight((o_query +
                                                             expansion[0]), 5)
                                           * (num_of_docs(o_query +
                                                          expansion[0])))
        print(sorted(extended_querys, key=lambda query: query[1]))
    except Exception as err:
        print("unexpected Error: %s" % err)


if __name__ == "__main__":
    main()
