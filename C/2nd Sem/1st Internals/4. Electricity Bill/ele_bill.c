#include<stdio.h>
void main()
{
    float amt;
    int n;
    printf("Enter the number of units consumed:\n");
    scanf("%d",&n);

    if(n<=200)
    {
        amt=n*80;
    }
        else if( n>200 && n<=300)
        {
          amt=200*80;
          amt=amt+((n-200)*90);  
        }
        else
        {
            amt=200*80;
            amt=amt+(100*90);
            amt=amt+((n-300)*100);
        }

    amt=amt/100;
    amt=amt+100;

    if(amt>400)
    {
        amt=amt+(amt*0.15);
    }
    printf("Total amount = Rs %.2f",amt);
}