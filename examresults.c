#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void){
  char modulename1[6];
  float score1;
  char modulename2[6];
  float score2;
  char modulename3[6];
  float score3;

  printf("\nEnter code of 1st Module : ");
  scanf("%s", &modulename1);
  printf("\nEnter Average Score of 1st Module : ");
  scanf("%f", &score1);

  printf("\nEnter code of 2st Module : ");
  scanf("%s", &modulename2);
  printf("\nEnter Average Score of 2st Module : ");
  scanf("%f", &score2);

  printf("\nEnter code of 3st Module : ");
  scanf("%s", &modulename3);
  printf("\nEnter Average Score of 3st Module : ");
  scanf("%f", &score3);

  printf("\n");
  printf("%s\t%s\n", "Name", "Average");
  // compare avgscores
  if(score1 > score2 && score1 > score3){ // if 1 is bigger than 2 && 1 is bigger than 3
    printf("%s\t%.2f\n", modulename1,score1);// print Module1 name
    if(score2 > score3){
      printf("%s\t%.2f\n", modulename2,score2);
      printf("%s\t%.2f\n", modulename3,score3);
    }
    else {
      printf("%s\t%.2f\n", modulename3,score3);
      printf("%s\t%.2f\n", modulename2,score2);
    }
  }
  else {
    if(score2 > score1 && score2 > score3){ // else if 2 is bigger than 1 && bigger than 3
      printf("%s\t%.2f\n", modulename2,score2);//print module2 name
      if(score1 > score3){
        printf("%s\t%.2f\n", modulename1,score1);
        printf("%s\t%.2f\n", modulename3,score3);
      }
      else {
        printf("%s\t%.2f\n", modulename3,score3);
        printf("%s\t%.2f\n", modulename1,score1);
      }
    }
    else{ //else 3 is bigger than 1 && bigger than 2
      printf("%s\t%.2f\n", modulename3,score3);  // print module3 name
      if(score2 > score1){
        printf("%s\t%.2f\n", modulename2,score2);
        printf("%s\t%.2f\n", modulename1,score1);
      }
      else {
        printf("%s\t%.2f\n", modulename1,score1);
        printf("%s\t%.2f\n", modulename2,score2);
      }
    }
  }
}
