#include<stdio.h>
void main()
{
    int n,i=1,f=1;
     
    printf("Enter the Number:\n");
    scanf("%d",&n);
    
    do
    {
        f=f*i;
        i++;
    }while(i<=n);
     
    printf("Factorial = %d",f);
}