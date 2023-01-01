#include<stdio.h>
void main()
{
    float a, b, c;
    char op;
    printf("Enter an expression[a+b]:\n");
    scanf("%f%c%f", &a, &op, &b);

    switch(op)
    {
        case'+':
        c=a+b;
        printf("Sum = %f",c);
        break;

        case'-':
        c=a-b;
        printf("Difference = %f",c);
        break;

        case'*':
        c=a*b;
        printf("Product = %f",c);
        break;

        case'/':
        c=a/b;
        printf("Division = %f",c);
        break;

        default:
        printf("Invalid expression");
        break;
        
    }    
}