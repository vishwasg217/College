#include<stdio.h>
void main()
{
    int i,j, n, temp, a[25];
    printf("enter the number of elements:\n");
    scanf("%d",&n);

    printf("Enter n elements:\n");
    for(i=0;i<n;i++)
        {scanf("%d",&a[i]);}

    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }

printf("\n The Sorted elements are:\n");
for(i=0;i<n;i++)
    printf("%d\t",a[i]);

}
    