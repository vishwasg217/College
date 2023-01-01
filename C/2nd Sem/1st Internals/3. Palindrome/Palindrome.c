#include<stdio.h>
void main()
{
    int rem, rev=0, num,n;
    printf("Enter a palindrome:\n");
    scanf("%d",&num);
    n=num;
    while(num!=0)
    {
        rem=num%10;
        num=num/10;
        rev=rev*10+rem;
    }
    printf("The reverse number is: %d \n",rev);

    if(rev==n)
    printf("The number is a palindrome");
        else 
        printf("The number is not a palindrome");
}