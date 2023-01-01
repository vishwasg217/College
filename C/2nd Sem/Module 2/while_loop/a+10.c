#include<stdio.h>
void main()
{
    int a=1;
    int sum=0;
    while(a<=101)
    {
        sum=sum+a;
        a=a+2;
        printf("%d\t %d\n",sum, a);
    }
    printf("sum = %d\n",sum);
    printf("a = %d\t",a);
}