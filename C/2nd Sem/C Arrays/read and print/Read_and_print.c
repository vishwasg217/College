#include<stdio.h>
void main()
{
    int i, a[20], n;

    printf("enter a value 'n'\n");
    scanf("%d",&n);

    printf("enter the values");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);

    printf("the values are:\n");
    for(i=0;i<n;i++)
        printf("%d\t",a[i]);

}