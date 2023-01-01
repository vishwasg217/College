#include<stdio.h>
int main()
{
    float a,b,c;
    printf("Enter two values:\n");
    scanf("%f %f",&a,&b);
    c=a+b;
    printf("Addition of two numbers =%f \n",c);
    c=a-b;
    printf("Subtraction of two numbers =%f \n",c);
    c=a*b;
    printf("Multiplication of two numbers =%f \n",c);
    c=a/b;
    printf("Division of two numbers =%f \n",c);

}