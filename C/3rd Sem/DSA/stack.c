#include<stdio.h>
#define SIZE 100

typedef struct student
{
    int id;
    char name[20];
    char gender;
}std;

int main()
{
    std *stack, popd, new, *top;
    int cap=2, count=0, ch;
    stack=(int*)malloc(cap*sizeof(std));
    for( ; ; )
    {
        printf("Enter a choice:\n");
        printf("1. Push\t2. Pop\t3. Display\t4. Exit\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: if(count==cap)
                    {
                        printf("Reallocating Memory.....\n");
                        stack=(int*)realloc(stack,cap*2*sizeof(std));
                        cap=cap*2;
                    }
                    printf("Enter the details\n");
                    scanf("%d %s %c", &new.id, &new.name, &new.gender);
                    push(new, &top, stack, &count);
                    break;

            case 2: if(count==0)
                    {
                        printf("The stack is empty\n");
                        break;
                    }
                    pop(&top, stack, &count);
                    break;

            case 3: display(stack, top);
                    break;

            case 4: exit(0);
        }
    }
}

void push(std new, int *top, std *stack, int *count)
{
    *top++;
    *(stack+(*top))=new;
    *count++;
}

std pop(int *top, std *stack, int *count)
{
    
}