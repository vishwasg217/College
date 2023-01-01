#include<stdio.h>
int pal(int p);
int main()
{
    int n, p;
    printf("Enter a number:\n");
    scanf("%d",&p);
    printf("The number in reverse order is %d\n",pal(p));
    n=p;
    if(n==pal(p))
    printf("The number is a palindrome");
        else 
        printf("The number is not a palindrome");
}

int pal(int p)
{
    int rem, rev=0;
    while(p!=0)
    {
        rem=p%10;
        p=p/10;
        rev=(rev*10)+rem;
    }
    return rev;
}