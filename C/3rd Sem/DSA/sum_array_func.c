#include<stdio.h>
void read_arr(int n,int arr[]);
int sum(int n,int arr[]);

int main()
{
    int n, arr[100];
    printf("Enter the number of elements:\n");
    scanf("%d",&n);
    printf("enter the elements:\n");
    read_arr(n,arr);
    printf("The sum of all is elements is %d",sum(n,arr));
}

void read_arr(int n, int arr[])
{
    int i;
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
}

int sum (int n, int arr[])
{
    int i,s=0;
    for(i=0;i<n;i++)
    {
        s=s+arr[i];
    }
    return s;
}