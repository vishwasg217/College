#include<stdio.h>
void main()
{
    int a=10,b=20,c=30;
    int aux;
    aux=((a>b&&a>c)?'a':((b>a&&b>c)?'b':'c'));
    printf("biggest number = %c",aux);
}