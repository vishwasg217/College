#include<stdio.h>
#include<setjmp.h>

jmp_buf jb;

void func1(void);
void func2(void);

int main()
{
    int i;
    printf("In main function: \n");
    i=setjmp(jb);
    if(i!=0)
        printf("Returned from function: \n");
    if(i==1)
    {
        printf("Returned from func1()");
        return 0;
    }
    if(i==2)
    {
        printf("Returned from func2()\n");
        return 0;
    }
    func1();
    return 0;        
}

void func1(void)
{
    printf("In func1\n");
    //longjmp(jb, 1);
    func2();

}

void func2(void)
{
    printf("In func2\n");
    longjmp(jb, 2);
}

