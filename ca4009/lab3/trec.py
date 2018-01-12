import csv
import re
import subprocess
from urllib.request import urlopen, urlretrieve

import numpy as np

gen_url = "http://136.206.48.185:8084/IRModelGenerator/TrecBatchQueryExecuterServlet?treccode=6&simf=BM25&k="
url = "http://136.206.48.185:8084/IRModelGenerator/res.6.BM25."

with open(r'output.csv', 'a') as f:
    writer = csv.writer(f)
    for k in np.arange(0.2, 2.2, 0.2):
        for b in np.arange(0.1, 1.0, 0.1):
            urlopen(gen_url + str(k) + "&b=" + str(b))
            urlretrieve(url + str(k) + "." + str(b), "output.tsv")

            args = ("./trec_eval", "qrels.trec678.adhoc", "output.tsv")
            popen = subprocess.Popen(args, stdout=subprocess.PIPE)
            popen.wait()
            output = popen.communicate()
            output = output[0]
            output = output.split(b'\n')
            mapO = output[5].split(b'\t')
            print(k, b)
            writer.writerow([k, b, mapO[2].decode()])
