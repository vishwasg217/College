#include<stdio.h>
int main()
{
    int a,b,aux;
    printf("Enter two numbers:");
    scanf("%d %d",&a,&b);
    aux=a;
    a=b;
    b=aux;
    printf("After swaping: %d %d",a,b);
    return 0;
}