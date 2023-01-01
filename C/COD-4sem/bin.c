#include<stdio.h>
void main()
{
    int a[10],n,i,count;    
    printf("Enter the number to convert: ");    
    scanf("%d",&n);    
    for(i=0;n>0;i++)    
    {    
    a[i]=n%2;    
    n=n/2;    
    }   
    for(i=0;i<=10;i++)
    {
        if(a[i]==1)
        {
            count++;
        }
    }
    for(i=0;i<=10;i++)
    {
        printf("%d",a[i]);
    }
    printf("The code is %d", count);

}