#include<stdio.h>
void read(int n, int a[]);
int large(int n, int a[]);
int small(int n, int a[]);
int main()
{
    int n, a[100];
    printf("Enter the number of elements:\n");
    scanf("%d",&n);
    printf("Enter the elements:\n");
    read(n,a);
    printf("The largest number is %d\n",large(n,a));
    printf("The smallest number is %d\n",small(n,a));
}

void read(int n, int a[])
{
    int i;
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
}

int large(int n, int a[])
{
    int i, l=a[0];
    for(i=1;i<n;i++)
    {
        if(l<a[i])
        {
            l=a[i];
        }
    }
    return l;
}

int small(int n, int a[])
{
    int i, s=a[0];
    for(i=1;i<n;i++)
    {
        if(s>a[i])
        {
            s=a[i];
        }
    }
    return s;
}
