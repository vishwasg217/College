#include<stdio.h>
void main()
{
    long int a=1, fact=1, n;
    printf("Enter a number\n");
    scanf("%ld",&n);
    while(a<=n)
    {
        fact=fact*a;
        a=a+1;
    }
    printf("factorial = %ld",fact);
}