#include<stdio.h>
#include<math.h>
#include<stdlib.h>
void main()
{
   int num, dec=0, rem, i=0;
   printf("Enter a binary number\n");
   scanf("%d", &num);

    while(num!=0)
    {
        rem=num%10;

        if(rem!=0 && rem!=1)
        {
            printf("Not a binary number");
            exit(0);
        }

        dec=dec+rem*pow(2,i);
        i++;
        num=num/10;
    }
    printf("The decimal equivalent is %d", dec);
}