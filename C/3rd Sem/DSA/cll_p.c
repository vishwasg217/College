#include<stdio.h>
#include<stdlib.h>

typedef struct n
{
    int data;
    struct n *link;
}NODE;

ins_front(int ele, NODE *last)
{
    NODE *new=getnode();
    new->data=ele;
    if(last==NULL)
    {
        last=new;
    }
    else
    {
        new->link=last->link;
    }
    last->link=new;
    return last;
}

ins_rear(int ele, NODE *last)
{
    NODE *new=getnode();
    new->data=ele;
    if(last==NULL)
    {
        last=new;
    }
    else
    {
        new->link=last->link;
    }
    last->link=new;
    return new;
}

del_front(NODE *last)
{
    NODE *temp;
    if(last==NULL)
    {
        printf("List is empty\n");
        return NULL;
    }
    if(last=last->link)
    {
        printf("Deleted node is %d\n", last->data);
        free(last);
        return NULL;
    }
    temp=last->link;
    last->link=temp;
    printf("Deleted node is %d\n", temp->data);
    free(temp);
    return last;
}

del_rear(NODE *last)
{
    NODE *prev=NULL, *pres=last->link;
    if(last==NULL)
    {
        printf("List is empty\n");
        return NULL;
    }
    if(last=last->link)
    {
        printf("Deleted node is %d\n", last->data);
        free(last);
        return NULL;
    }
    while(pres!=last)
    {
        prev=pres;
        pres=pres->link;
    }
    prev->link=last->link;
    printf("Deleted node is %d\n", last->data);
    free(pres);
    return prev;
}