#include<stdio.h>
#include<math.h>
void main()
{
    int num, bin=0, rem, i=0;
    printf("enter a decimal number\n");
    scanf("%d", &num);

    while(num!=0)
    {
        rem=num%2;
        bin=bin+rem*pow(10,i);
        i++;
        num=num/2;
    }
    printf("The binary equivalent is %d", bin);
}
