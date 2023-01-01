#include<stdio.h>
int isprime(int num)
{
    int i;
    if(num==0||num==1)
    return 0;
    for(i=2;i<=num/2;i++)
        if(num  % i==0)
        {
            return 0;
        }
    return 1;
}

int main()
{
    int op1;
    printf("enter a number\n");
    scanf("%d",&op1);
    if(isprime(op1))
    printf("%d is a prime number\n",op1);
    else printf("%d is not a prime number",op1);
    return 0;
}