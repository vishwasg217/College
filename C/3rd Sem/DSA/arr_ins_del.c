#include<stdio.h>
#include<stdlib.h>
#define SIZE 10
void read_arr(int n, int arr[]);
void insert(int *n, int arr[]);
void delete(int *n, int arr[]);
void traverse(int n, int arr[]);
int main()
{
    int n, arr[SIZE], ch;
    printf("Enter the size of the element:\n");
    scanf("%d",&n);
    read_arr(n, arr);
    for(;;)
    {
        printf("Enter a choice:\n");
        printf("1. Insert\t2. Delete\t3. Traverse\t4. Exit");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: insert(&n,arr);
                    break;
            case 2: delete(&n,arr);
                    break;
            case 3: traverse(n, arr);
                    break;
            case 4: exit(0);
            default: printf("Enter a choice between 1-4:\n");
                     break;
        }
    }
}

void read_arr(int n, int arr[])
{
    int i;
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
}

void insert(int *n, int arr[])
{
    int pos, ele, i;
    printf("Enter the position:\n");
    scanf("%d",&pos);
    while(pos>=1&&pos<=(*n+1))
    {
        printf("Enter an element:\n");
        scanf("%d",&ele);
        for(i=(*n-1);i>=(pos-1);i--)
        {
            arr[i+1]=arr[i];
        }
        *n=(*n+1);
        arr[pos-1]=ele;
        return;
    }
    printf("Enter a valid position\n");
}

void delete(int *n, int arr[])
{
    int pos, i;
    printf("Enter the position to be deleted:\n");
    scanf("%d",&pos);
    while(pos>=1&&pos<=(*n))
    {
        for(i=(pos-1);i<*n;i++)
        {
            arr[i]=arr[i+1];
        }
        *n=(*n-1);
        return;
    }
    printf("Enter a valid position\n");
}

void traverse(int n, int arr[])
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("%d",arr[i]);
    }
}

