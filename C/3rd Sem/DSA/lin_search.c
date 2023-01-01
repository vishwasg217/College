#include<stdio.h>
void read(int n,int a[]);
int lin_search(int n, int a[], int key);
int main()
{
    int n, a[100], x, key;
    printf("Enter the number of elements:\n");
    scanf("%d",&n);
    printf("Enter the elements:\n");
    read(n, a);
    printf("Enter the element to be searched:\n");
    scanf("%d",&key);
    x=lin_search(n,a,key);
    if(x==-1)
        printf("The element is not present");
        else 
            printf("The element is present at %d",x);

}

void read(int n, int a[])
{
    int i;
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
}

int lin_search(int n, int a[], int key)
{
    int i;
    for(i=0;i<n;i++)
    {
        if(key==a[i])
        {
            return i;
        }
    }
    return -1;
}