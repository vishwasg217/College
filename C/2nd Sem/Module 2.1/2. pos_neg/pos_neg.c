#include<stdio.h>
void main()
{
    int num;
    printf("Enter an integer:");
    scanf("%d",&num);

    if(num>0)
    printf("Integer is positive");

        else if(num<0)
        printf("Integer is negative");

        else 
        printf("Integer is zero");
}