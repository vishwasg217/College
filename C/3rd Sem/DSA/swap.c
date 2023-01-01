#include<stdio.h>
void swap(int *a, int *b);
int main()
{
    int a,b;
    printf("Enter the elements to be swapped, a and b:\n");
    scanf("%d %d",&a,&b);
    swap(&a,&b);
    printf("Elements after swapping:\n a=%d\tb=%d",a,b);
    return 0;
}

void swap(int *a, int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
    return;
}