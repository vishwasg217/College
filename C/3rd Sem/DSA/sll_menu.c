#include<stdio.h>
typedef struct node
{
    int data;
    struct node *link;
}NODE;

int main()
{
    NODE *first=NULL;
    int ch, ele;
    for(;;)
    {
        printf("Enter a choice:\n\n");
        printf("1. Insert at front\n2. Insert from rear\n3. Delete from front\n4. Delete from rear\n\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: printf("Enter an element to insert:\n");
                    scanf("%d",&ele);
                    first=insert_front(ele, first);
                    break;
            case 2: printf("Enter an element to insert:\n");
                    scanf("%d",&ele);
                    first=insert_rear(ele, first);
                    break;
            case 3: first=delete_front(first);
                    break;
            case 4: first=delete_rear(first);
                    break;
            case 5: exit(0);
        }
    }
}

NODE *insert_front(int ele, NODE *first);
{
    NODE *new=getnode();
    temp->data=ele;
    temp->link=first;
    return temp;
}
