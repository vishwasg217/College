#include<stdio.h>
void main()
{   
    int a=1, n, sum=0;
    printf("Enter a number:");
    scanf("%d",&n);
    while(a<=n)
    {
        sum=sum+a;
        a++;
    }
    printf("Sum = %d", sum);
}
