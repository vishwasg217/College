#include<stdio.h>
#define SIZE 30

typedef enum{lp, rp, plus, min, mul, div, mod, pow, eos, oper}precedence;

void push(precedence token, int *top, int stack[]);
precedence pop(int *top, int stack[]);
void infix_to_postfix(char infix[]);
precedence get_token(char *symbol, int *n, char infix[]);
void print_token(precedence token);
int main()
{
    char infix[SIZE];
    printf("Enter an infix expression:\n");
    scanf("%s",infix);
    printf("The postfix conversion is:");
    infix_to_postfix(infix);
}



void infix_to_postfix(char infix[])
{
    int isp[]={0,4,1,1,2,2,2,3,0};
    int icp[]={11,4,1,1,2,2,2,3,0};
    char symbol;
    precedence token;
    int stack[SIZE], top=0, n=0;
    stack[top]=eos;
    for(token=get_token(&symbol, &n, infix);token!=eos;token=get_token(&symbol, &n, infix))
    {
        if(token==oper)
        {
            printf("%c",symbol);
        }
        else if(token==rp)
        {
            while(stack[top]!=lp)
            {
                print_token(pop(&top, stack));
            }
            pop(&top, stack);
        }
        else
        {
            while(isp[stack[top]]>=icp[token])
            {
                print_token(pop(&top,stack));
            }
            push(token, &top, stack);
        }
    }
    while((token=pop(&top, stack)!=eos))
    {
        print_token(token);
    }
}

precedence get_token(char *symbol, int *n, char infix[])
{
    *symbol=infix[(*n)++];
    switch(*symbol)
    {
        case '(': return lp;
        case ')': return rp;
        case '+': return plus;
        case '-': return min;
        case '*': return mul;
        case '/': return div;
        case '%': return mod;
        case '^': return pow;
        case '\0': return eos;
        default: return oper;
    }
}

void print_token(precedence token)
{
    switch(token)
    {
    case plus:printf("+");
                break;
    case min:printf("-");
                break;
    case mul:printf("*");
                break;
    case div:printf("/");
                break;
    case mod:printf("%%");
                break;
    case pow:printf("^");
                break;
    }
}

void push(precedence token, int *top, int stack[])
{
    stack[++(*top)]=token;
}

precedence pop(int *top, int stack[])
{
    return stack[(*top)--];
}

