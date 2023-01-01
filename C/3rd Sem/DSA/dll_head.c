#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node *llink;
    struct node *rlink;
}NODE;

NODE *getnode();
void ins_front(int ele, NODE *head);
void ins_rear(int ele, NODE *head);
void del_front(NODE *head);
void del_rear(NODE *head);
void del_spec(int ele, NODE *head);
void display(NODE *head);

int main()
{
    NODE *head=getnode();
    head->data=0;
    head->llink=NULL;
    head->rlink=NULL;
    int ch, ele;
    for(;;)
    {
        printf("\nEnter a choice:\n");
        printf("1. Insert front\t2.Insert rear\t3. Delete front\t4. Delete rear\t5. Delete Specific\t6. Display\t7. Exit\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: printf("Enter an element:\n");
                    scanf("%d",&ele);
                    ins_front(ele, head);
                    break;
            case 2: printf("Enter an element:\n");
                    scanf("%d",&ele);
                    ins_rear(ele, head);
                    break;
            case 3: del_front(head);
                    break; 
            case 4: del_rear(head);
                    break;
            case 5: printf("Enter an element:\n");
                    scanf("%d",&ele);
                    del_spec(ele, head);
                    break;
            case 6: display(head);
                    break;
            case 7: exit(0);
        }
    }
}

NODE *getnode()
{
    NODE *new=(NODE *)malloc(sizeof(NODE));
    if(new==NULL)
    {
        printf("No Memory\n");
    }
}

void ins_front(int ele, NODE *head)
{
    NODE *new=getnode();
    new->data=ele;
    new->rlink=head->rlink;
    new->llink=head;
    head->rlink=new;
    new=new->rlink;
    new->llink=head->rlink;
    (head->data)++;
    return;
}

void ins_rear(int ele, NODE *head)
{
    NODE *new=getnode();
    NODE *temp;
    new->data=ele;
    new->rlink=NULL;
    if(head->rlink==NULL)
    {
        new->llink=head;
        head->rlink=new;
        (head->data)++;
        return;
    }
    temp=head;
    while(temp->rlink!=NULL)
    {
        temp=temp->rlink;
    }
    new->llink=temp;
    temp->rlink=new;
    (head->data)++;
    return;
}

void del_front(NODE *head)
{
    NODE *temp, *next;
    if(head->rlink==NULL)
    {
        printf("List is empty\n");
        return;
    }
    temp=head->rlink;
    if(temp->rlink==NULL)
    {
        printf("The element deleted is %d\n", temp->data);
        free(temp);
        head->rlink=NULL;
        (head->data)--;
        return;
    }
    printf("The element deleted is %d\n", temp->data);
    next=temp->rlink;
    head->rlink=next;
    next->llink=head;
    free(temp);
    (head->data)--;
    return;
}

void del_rear(NODE *head)
{
    NODE *prev, *pres, *temp;
    if(head->rlink==NULL)
    {
        printf("List is empty\n");
        return;
    }
    temp=head->rlink;
    if(temp->rlink==NULL)
    {
        printf("The element deleted is %d\n", temp->data);
        free(temp);
        head->rlink=NULL;
        (head->data)--;
        return;
    }
    prev=head;
    pres=head->rlink;
    while(pres->rlink!=NULL)
    {
        prev=pres;
        pres=pres->rlink;
    }
    printf("The element deleted is %d\n", pres->data);
    free(pres);
    prev->rlink=NULL;
    (head->data)--;
    return;
}

void del_spec(int ele, NODE *head)
{
    NODE *prev=head;
    NODE *pres=head->rlink;
    NODE *next, *temp;
    if(head->rlink=NULL)
    {
        printf("The list is empty\n");
        return;
    }
    temp=head->rlink;
    
    if((temp->rlink==NULL)&&(temp->data==ele))
    {
        printf("The element deleted is %d\n", temp->data);
        free(temp);
        head->rlink=NULL;
        (head->data)--;
        return;
    }
    
    while((pres->rlink!=NULL)&&(pres->data!=ele))
    {
        prev=pres;
        pres=pres->rlink;
    }
    if(pres->data==ele)
    {
        next=pres->rlink;
        printf("The element deleted is %d\n", pres->data);
        prev->rlink=next;
        next->llink=prev;
        free(pres);
        (head->data)--;
        return;
    }
    printf("Element not found\n");
}

void display(NODE *head)
{
    
	NODE *temp;
    printf("Number of elements:%d\n",head->data);
	temp=head->rlink;
	if(head->rlink==NULL)
	{
		printf("List is empty\n");
		return;
	}
	while(temp->rlink!=NULL)
		{	
			printf("%d\t", temp->data);
			temp=temp->rlink;
		}
	printf("%d\n",temp->data);
    return;
}