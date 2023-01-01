#include<stdio.h>
void main()
{
    int i,j, n, temp, a[25];
    printf("enter the number of elements:\n");
    scanf("%d",&n);

    printf("Enter n elements:\n");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    printf ("Sorted elements:\n");
    for(i=0;i<n;i++)
        printf("%d\t",a[i]);
}