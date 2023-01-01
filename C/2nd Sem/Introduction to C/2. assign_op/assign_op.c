#include<stdio.h>
void main()
{
    int a=10,c;

    c=a;
    printf("= Operator: value of c=%d\n",c);

    c+=a;
    printf("+= Operator: value of c=%d\n",c);

    c-=a;
    printf("-= Operator: value of c=%d\n",c);
    
    c*=a;
    printf("*= Operator: value of c=%d\n",c);

    c/=a;
    printf("/= Operator: value of c=%d\n",c);

    c%=a;
    printf("%= Operator: value of c=%d\n",c);

    c=100;
    c<<=2;
    printf("<<= Operator: value of c=%d\n",c);

    c>>=2;
    printf(">>= Operator: value of c=%d\n",c);

    c&=a;
    printf("&= Operator: value of c=%d\n",c);
    
    c^=a;
    printf("^= Operator: value of c=%d\n",c);

    c|=a;
    printf("|= Operator: value of c=%d\n",c);
}