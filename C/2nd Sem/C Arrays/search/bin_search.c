#include<stdio.h>
#include<stdlib.h>
int main()
{
    int a[30], i, num,key,low,mid,high;
    printf("enter number of elements");
    scanf("%d",&num);
    printf("enter the elements in sorted order:");
    for(i=0;i<num;i++)
        scanf("%d",&a[i]);
    printf("enter the key element to be searched\n");
    scanf("%d",&key);
    low=0;
    high=num-1;
    while(low<=high)
    {
        mid=(low+high)/2;
        if(a[mid]==key)
        {
            printf("element %d is found at position %d",key,mid+1);
            exit(0);
        }
        else if(a[mid]>key)
            high=mid-1;
        else low=mid+1;
    }
    printf("unsuccessful search\n");
    return 0;
}