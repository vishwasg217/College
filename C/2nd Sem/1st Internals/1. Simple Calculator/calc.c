#include<stdio.h>
#include<stdlib.h>
void main()
{
    int a,b,c;
    char op;
    printf("Enter an expression(Ex:a+b):\n");
    scanf("%d%c%d",&a,&op,&b);

    switch(op)
    {
        case'+': c=a+b;
        break;

        case'-': c=a-b;
        break;

        case'*': c=a*b;
        break;

        case'/': if(b==0)
                 {
                     printf("divide by zero error");
                     exit(0);
                 }
                  else c=a/b;
        break;
    }
    printf("Result = %d",c);
    
}