#include<stdio.h>
#include<stdlib.h>

typedef struct head
{
    int count;
    struct node*llink,*rlink;
}HEAD;

typedef struct node
{
    char ssn[10], name[10], dept[5], designation[30];
    float salary;
    long int ph_no;
    struct node*llink,*rlink;
}NODE;



NODE *getnode();
void ins_front(HEAD *head);
void ins_rear(HEAD * head);
void del_front(HEAD *head);
void del_rear(HEAD *head);
void display(HEAD *head);

int main()
{
    HEAD *head=(HEAD *)malloc(sizeof(HEAD));
    int ch;
    for(;;)
    {
        printf("Enter a choice\n");
        printf("1. Insert Front\t2. Insert Rear\t3. Delete Front\t4. Delete Rear\t5. Display\t6.Exit\n");
        scanf("%d", &ch);
        printf("-----");
        switch(ch)
        {
            case 1: ins_front(head);
                    break;
            case 2: ins_rear(head);
                    break;
            case 3: del_front(head);
                    break;
            case 4: del_rear(head);
                    break;
            case 5: display(head);
                    break;
            case 6: exit(0);
        }
    }
}

NODE *getnode()
{
    NODE *new=(NODE *)malloc(sizeof(NODE));
    if(new==NULL)
    {
        printf("No memory\n");
        return NULL;
    }
    return new;

}

void ins_front(HEAD *head)
{
    
    NODE *new=getnode();
    printf("Enter the employee details\n");
    scanf("%s %s %s %s %f %ld", new->ssn, new->name, new->dept, new->designation, &(new->salary), &(new->ph_no));
    new->rlink=head->rlink;
    new->llink=head;
    head->rlink=new;
    new=new->rlink;
    new->llink=head->rlink;
    (head->count)++;
    return;
}

void ins_rear(HEAD * head)
{
    NODE *new=getnode();
    NODE *temp;
    printf("Enter the employee details\n");
    scanf("%s %s %s %s %f %ld", new->ssn, new->name, new->dept, new->designation, &(new->salary), &(new->ph_no));
    new->rlink=NULL;
    if(head->rlink==NULL)
    {
        new->llink=head;
        head->rlink=new;
        (head->count)++; 
    }
    temp=head->rlink;
    while(temp->rlink!=NULL)
    {
        temp=temp->rlink;
    }
    temp->rlink=new;
    new->llink=temp;  
    (head->count)++; 
}

void del_front(HEAD *head)
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
        printf("The deleted details are:\n");
        printf("%s %s %s %s %f %ld", temp->ssn, temp->name, temp->dept, temp->designation, temp->salary, temp->ph_no);
        free(temp);
        head->rlink=NULL;
        (head->count)--;   
    }
    next=temp->rlink;
    head->rlink=next;
    next->llink=head;
    free(temp);
    (head->count)--;
}

void del_rear(HEAD *head)
{
    NODE *temp, *prev, *pres;
    if(head->rlink==NULL)
    {
        printf("List is empty\n");
        return;
    }
    temp=head->rlink;
    if(temp->rlink==NULL)
    {
        printf("The deleted details are:\n");
        printf("%s %s %s %s %f %ld", temp->ssn, temp->name, temp->dept, temp->designation, temp->salary, temp->ph_no);
        free(temp);
        head->rlink=NULL;
        (head->count)--;
    }
    prev=head;
    pres=head->rlink;
    while(pres->rlink!=NULL)
    {
        prev=pres;
        pres=pres->rlink;
    }
    prev->rlink=NULL;
    free(pres);
    (head->count)--;
}

void display(HEAD *head)
{
    NODE *temp;
    if(head->rlink==NULL)
    {
        printf("List empty\n");
    }
    printf("\nThe details are:\n");
    printf("\n*********\n");
    temp=head->rlink;
    while(temp->rlink!=NULL)
    {
        printf("%s\t%s\t%s\t%s\t%f\t%ld\n",temp->ssn,temp->name,temp->dept,temp->designation,temp->salary,temp->ph_no);
        temp=temp->rlink;
    }
    printf("No of detail records in list is:%d\n",head->count);
    return;
}

