#include<stdio.h>
#include<stdlib.h>

typedef struct polynode
{
    float co_eff;
    int expx, expy, expz;
    struct polynode *link;   
}POLY;

int main()
{
    POLY *h1=getnode(), *h2=getnode();
    POLY *h3=getnode();
    int n1, n2;
    h1->link=h1;
    h2->link=h2;
    printf("Enter the number of terms in polynomial 1 and 2\n");
    scanf("%d %d", &n1, &n2);
    printf("Enter the terms in polynomial 1:\n");
    read_poly(n1, h1);
    printf("Enter the terms in polynomial 2:\n");
    read_poly(n2, h2);
    printf("Result = ");
    h3=add_poly(h1, h2);
    print_poly(h3);
}

POLY *getnode()
{
    POLY *new=(POLY *)malloc(sizeof(POLY));
    if(new==NULL)
    {
        printf("No Memory\n");
    }
}

void read_poly(int n, POLY *h)
{
    POLY *temp;
    int i;
    temp=h;
    for(i=0; i<n; i++)
    {
        POLY *n=getnode();
        printf("Enter co-efficients and exponents:\n");
        scanf("%f %s %s %s", &(n->co_eff), &(n->expx), &(n->expy), &(n->expz));
        temp->link=n;
        temp=temp->link;
    }
    temp->link=h;
}

print_poly(POLY *h3)
{
    
}

polyadd(POLY *h1, POLY *h2)
{
    POLY *temp1, *temp2;
    POLY *res=getnode();
    POLY *tempres=res;
    int sum;
    temp1=h1->link;
    while(temp1!=h1)
    {
        temp2=h2->link;
        while(temp2!=h2)
        {
            switch(comp(temp1, temp2))
            {
                case 1: sum=temp1->co_eff+temp2->co_eff;
                        attach(sum, temp1, &tempres);
                        h2=delete(h2, temp2);
                        temp2=h2->link;
                        temp1=temp1->link;
                        break;

                case -1: temp2=temp2->link;
                        break;
            }
        }
        if(temp1!=h1)
        {
            attach(temp1->co_eff, temp1, &tempres);
            temp1=temp1->link;
        }
    }
    if(temp2!=h2)
    {
        attach(temp2->co_eff, temp2, &tempres);
        temp2=temp2->link;
    }
    tempres->link=res;
    return res;
}

int comp(POLY *t1, POLY *t2)
{
    if((t1->expx==t2->expx)&&(t1->expy==t2->expy)&&(t1->expz==t2->expz))
        return 1;
    return -1;
}

void attach(int co, POLY *t, POLY **tres)
{
        POLY *new=getnode();
        new->co_eff=co;
        new->expx=t->co_eff;
        new->expy=t->expy;
        new->expz=t->expz;
        (*tres)->link=new;
        *tres=(*tres)->link;
}