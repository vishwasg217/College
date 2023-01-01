#include<stdio.h>
int main()
{
  int Number, i = 1, Sum = 0;
  
  printf("Enter an Integer\n");
  scanf("%d", &Number);
  
  do
  {
     Sum = Sum + i;
     i++;
  } while(i <= Number);
  
  printf("Sum = %d", Sum);
}
