public class Dice {
  public static int diceRoller() {
    int dice = (int) (Math.random() * 6);
    dice++;
    return dice;
  }

  public static void main(String[] args) {
    System.out.print("How many throws of the dice: ");
    int limit = Console.readInt();
    int[] counter = new int[7];
    int[] countMost = new int[7];
    int[] countLeast = new int[7];
    double[] countAvg = new double[7];
    for (int i = 1; i <= 6; i++) {
      countLeast[i] = limit;
    }
    for (int j = 0; j < 50; j++) {
      for (int i = 1; i <= 6; i++) {
        counter[i] = 0;
      }
      for (int i = 0; i < limit; i++) {
        int dice = diceRoller();
        for (int k = 1; k <= 6; k++) {
          if (dice == k) counter[k] = counter[k] + 1;
        }
      }
      for (int i = 1; i <= 6; i++) {
        if (counter[i] > countMost[i]) countMost[i] = counter[i];
        if (counter[i] < countLeast[i]) countLeast[i] = counter[i];
        countAvg[i] = countAvg[i] + counter[i];
      }
    }
    for (int i = 1; i <= 6; i++) {
      countAvg[i] = countAvg[i] / 50;
    }
    System.out.println("Number" + ":\t" + "Average" + ":\t" + "Most" + ":\t\t" + "Fewest");
    for (int i = 1; i <= 6; i++)
      System.out.println(i + ":\t" + countAvg[i] + "\t\t" + countMost[i] + "\t\t" + countLeast[i]);
  }
}
/* on first test of my program my results where wrong i realised i was adding multiple dice to the wrong numbers but once i fixed this i got
How many throws of the dice: 6000
1:	1030
2:	999
3:	983
4:	1002
5:	1002
6:	984
How many throws of the dice: 1000
1:	176
2:	149
3:	168
4:	180
5:	162
6:	165
How many throws of the dice: 600
1:	109
2:	103
3:	74
4:	97
5:	103
6:	114
How many throws of the dice: 10
1:	0
2:	2
3:	0
4:	4
5:	3
6:	1
How many throws of the dice: 6
1:	3
2:	2
3:	0
4:	0
5:	0
6:	1

while making my program record the the most and least times a number came up my least came up as 0 so i  set it to initialise at how ever many mines the user rolles the dice as the least number will be smaller then that
once i had the program counting average, most and leasts i tested it:
How many throws of the dice: 6000
Number:	Average:	Most:		Fewest
1:	1004.6		1085		950
2:	995.5		1052		956
3:	1005.52		1081		956
4:	1002.52		1072		946
5:	1001.06		1067		940
6:	990.8		1043		920
How many throws of the dice: 1000
Number:	Average:	Most:		Fewest
1:	163.32		183		144
2:	166.74		190		143
3:	168.68		194		149
4:	167.38		196		145
5:	169.58		189		141
6:	164.3		187		142
How many throws of the dice: 600
Number:	Average:	Most:		Fewest
1:	97.8		118		72
2:	101.44		126		84
3:	99.74		116		75
4:	100.16		122		77
5:	100.0		124		78
6:	100.86		119		84
How many throws of the dice: 100
Number:	Average:	Most:		Fewest
1:	16.62		24		10
2:	15.94		25		6
3:	17.34		28		11
4:	17.16		26		10
5:	16.22		25		7
6:	16.72		25		9
How many throws of the dice: 60
Number:	Average:	Most:		Fewest
1:	10.28		18		5
2:	9.72		17		5
3:	8.98		16		2
4:	10.82		18		4
5:	10.06		16		5
6:	10.14		18		5
How many throws of the dice: 10
Number:	Average:	Most:		Fewest
1:	1.9		4		0
2:	1.94		5		0
3:	1.46		5		0
4:	1.5		4		0
5:	1.62		5		0
6:	1.58		4		0
How many throws of the dice: 6
Number:	Average:	Most:		Fewest
1:	0.94		3		0
2:	1.1		3		0
3:	1.1		3		0
4:	0.84		3		0
5:	1.12		4		0
6:	0.9		3		0
*/
