#include<stdio.h>
int main()
{
    int i, n, a[100];
    printf("Enter the array size:\n");
    scanf("%d",&n);
    printf("Enter the array elements\n");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    printf("The array elements are:\n");
    for(i=0;i<n;i++)
        printf("%d\t",a[i]);
}