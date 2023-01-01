#include<stdio.h>
void main()
{
    int a=10,b;
    char c;
    c=((a==10)?'Y':'N');
    printf("c = %c\n",c);
    c=((a!=5)?'T':'F');
    printf("c = %c\n",c);
    b=((a>0)?10:0);
    printf("b = %d\n",b);
    printf("size of variable a is %d\n",sizeof(a));
    printf("size of variable c is %d\n",sizeof(c));
    printf("size of float is %d\n",sizeof(float));
    printf("size of double is %d\n",sizeof(double));
}