#include<stdio.h>
void main()
{
    int a=10, b=5;
    int c;
    c=a--;
    printf("value of c = %d\t\t",c);
    printf("value of a = %d\n",a);

    a=10;
    c=--a;
    printf("value of c = %d\t\t",c);
    printf("value of a = %d\n",a);

    a=10;
    c=a-- + b--;
    printf("value of c = %d\t\t",c);
    printf("value of a = %d\t\t",a);
    printf("value of b = %d\n",b);

    a=10; b=5;
    c= --a + --b;
    printf("value of c = %d\t\t",c);
    printf("value of a = %d\t\t",a);
    printf("value of b = %d\n",b);

    a=10; b=5;
    c=a-- + --b;
    printf("value of c = %d\t\t",c);
    printf("value of a = %d\t\t",a);
    printf("value of b = %d\n",b);

    a=10; b=5;
    c=--a + b--;
    printf("value of c = %d\t\t",c);
    printf("value of a = %d\t\t",a);
    printf("value of b = %d\n",b);

}
