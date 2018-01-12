# Section 4

`trec eval qrels.trec678.adhoc trec678.res`

## Recall
  - Rpec: 0.2644
## mean average precision (MAP)
  - map: 0.2145
## precision at rank cut offs (Prec)
  - P_5: 0.4240
  - P_10: 0.4027
  - P_15: 0.3738
  - P_20: 0.3487
  - P_30: 0.3111
  - P_100: 0.1940
  - P_200: 0.1369
  - P_500: 0.0785
  - P_1000: 0.0485

You can from the results that as the cut off increases the precision of the results decreases meaning that the more documents are added the higher the false positives are meaning correct reaults can get pushed down the ranking.
The MAP shows us that as the more requests are made the precision of the results goes down. Showing that fewer requests can results in a lower map despite the recall precision not actually being preciese.

`trec eval -q qrels.trec678.adhoc trec678.res`

```
map                   	301	0.0179
Rprec                 	301	0.0949
P_5                   	301	0.2000
P_10                  	301	0.2000
P_15                  	301	0.2667
P_20                  	301	0.2000
P_30                  	301	0.1667
P_100                 	301	0.1300
P_200                 	301	0.1200
P_500                 	301	0.0920
P_1000                	301	0.0740
map                   	302	0.4737
Rprec                 	302	0.4935
P_5                   	302	0.6000
P_10                  	302	0.7000
P_15                  	302	0.6667
P_20                  	302	0.7000
P_30                  	302	0.6333
P_100                 	302	0.4700
P_200                 	302	0.3200
P_500                 	302	0.1280
P_1000                	302	0.0640
map                   	303	0.1171
Rprec                 	303	0.1000
P_5                   	303	0.2000
P_10                  	303	0.1000
P_15                  	303	0.0667
P_20                  	303	0.1000
P_30                  	303	0.0667
P_100                 	303	0.1000
P_200                 	303	0.0500
P_500                 	303	0.0200
P_1000                	303	0.0100
```

In the above results you can see that precision of the map and recall change quite differently from
query to query in 301 the map is very low while in 302 it is much higher at .47 rather then .01.
This shows that individual queries can result in more precise results then an average of multiple
queries as they those indivual querires can have very good or bad but this is lost in an average of
the results
