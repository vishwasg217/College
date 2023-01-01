#include<stdio.h>
#include<ctype.h>
int compute(int op1, int op2, char symbol);
char eval_post(char postfix[]);
void push(int ele, int *top, int stack[]);
int pop(int *top, int stack[]);
int main()
{
    char postfix[10];
    printf("Enter a postfix expression:\n");
    scanf("%s",postfix);
    printf("Result: %d",eval_post(postfix));
    return 0;
}

 char eval_post(char postfix[])
 {
    char symbol;
    int token, i=0, top=-1, stack[20], op2, op1, result, temp;
    while(postfix[i]!='\0')
    {
        symbol=postfix[i];
        if(isdigit(symbol))
        {
            token=symbol-'0';
            push(token, &top, stack);
        }
        else
        {
            op2=pop(&top, stack);
            op1=pop(&top, stack);
            result=compute(op2, op1, symbol);
            push(result, &top, stack);
        }
        i=i+1;
    }
    temp=(pop(&top, stack));
    return temp;
 }

void push(int ele, int *top, int stack[])
{
    stack[++(*top)]=ele;
}

int pop(int *top, int stack[])
{
    return stack[(*top)--];
}

int compute(int op1, int op2, char symbol)
{
    switch(symbol)
    {
        case '+': return (op1+op2);
                  break;
        case '-': return (op1-op2);
                  break;
        case '*': return (op1*op2);
                  break;
        case '/': return (op1/op2);
                  break;
        case '%': return (op1%op2);
                  break;
        default: printf("Invalid\n");
    }
}



