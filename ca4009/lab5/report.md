# lab 5 and 6

## Section 3

To generate my base line file i ran the following script with passing it my search query and qid as
arguments.
My queries were 
```
<top>
<num>470</num>
<title>Japan</title>
</top>
<top>
<num>584</num>
<title>Japan attractions</title>
</top>
<top>
<num>638</num>
<title>Japan's UNESCO World Heritage Sites</title>
</top>
<top>
<num>683</num>
<title>Nara, Japan</title>
</top>
<top>
<num>758</num>
<title>Tokyo Nara Transportation</title>
</top>
<top>
<num>807</num>
<title>Nara train</title>
</top>
<top>
<num>822</num>
<title>Nara Japan train</title>
</top>
<top>
<num>848</num>
<title>Nara Airport</title>
</top>
<top>
<num>858</num>
<title>how to get to Nara from Tokyo</title>
</top>
<top>
<num>880</num>
<title>tokyo nara train</title>
</top>
```

```
#! /usr/bin/env python3

import json
import sys
from urllib.request import urlopen

qid = sys.argv[1]
query = sys.argv[2]
url = 'http://clueweb.adaptcentre.ie/WebSearcher/search?query=' + query
response = urlopen(url)
data = json.loads(response.read().decode(
    response.info().get_param('charset') or 'utf-8'))

try:
    for json_inner_array in data:
        rank = 1
        for json_data in json_inner_array:
            print(str(qid) + "\tQ0\t" + json_data["id"] + str(rank) +
                  "\t" + json_data["score"] + "\tlm")
        rank = rank + 1
except:
    print("Error")
```

I then used the baseline file to run trec eval. From the results i was able to see despite being hi
precision the results were not accurate

# Section 4


