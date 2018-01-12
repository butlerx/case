#! /usr/bin/env python3
""" Scrape IRModel  treceval binary required"""
import csv
import os
import subprocess
from urllib.request import urlopen, urlretrieve

import numpy as np

URL = "http://136.206.48.185:8084/IRModelGenerator"
GEN = URL + "/TrecBatchQueryExecuterServlet?treccode=6&simf=BM25&k="
GET = URL + "/res.6.BM25."

os.remove("output.csv")
with open(r'output.csv', 'a') as f:
    WRITER = csv.writer(f)
    for k in np.arange(0.2, 2.2, 0.2):
        for b in np.arange(0.1, 1.0, 0.1):
            urlopen(GEN + str(k) + "&b=" + str(b))
            urlretrieve(GET + str(k) + "." + str(b), "temp.tsv")
            args = ("./trec_eval", "qrels.trec678.adhoc", "temp.tsv")
            popen = subprocess.Popen(args, stdout=subprocess.PIPE)
            popen.wait()
            output = popen.communicate()
            output = output[0]
            output = output.split(b'\n')
            mapO = output[5].split(b'\t')
            print(k, b)
            WRITER.writerow([k, b, mapO[2].decode()])
    os.remove("temp.tsv")
