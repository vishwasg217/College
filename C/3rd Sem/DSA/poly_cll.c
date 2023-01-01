#include<stdio.h>
#include<stdlib.h>

typedef struct poly
{
    float co_eff;
    int expx, expy, expz;
    struct poly *link;
}POLY;

int main()
{
    int n1, n2;
    POLY *h1=getnode();
    POLY *h2=getnode();
    h1->link=h1;
    h2->link=h2;
    POLY *h3=getnode();
    h3->link=h3;
    printf("Enter the number of terms for poly1 and poly2\n");
    scanf("%d %d", &n1, &n2);
    printf("Enter the terms for poly 1\n");
    read_poly(n1, h1);
    printf("Enter the terms for poly 2\n");
    read_poly(n2, h2);
    h3=add_poly(h1, h2);
    print_poly(h3);
    eval(h3);
}

POLY *getnode()
{
    POLY *new=(POLY *)malloc(sizeof(POLY));
    if(new==NULL)
    {
        printf("No memory\n");
        return NULL;
    }
    return new;
}

void read_poly(int n, POLY *h)
{
    POLY *temp;
    temp=h;
    int i, n;
    for(i=0,i<n,i++)
    {
        POLY *new=getnode();
        scanf("%f %d %d %d", &(new->co_eff), &(new->expx), &(new->expy), &(new->expz));
        temp->link=new;
        temp=temp->link;
    }
    temp->link=h;
}

void print_poly(POLY *h)
{
    POLY *temp=h->link;
    while(temp!=h)
    {
        printf("%f x^%d y^%d z^%d+", temp->co_eff, temp->expx, temp->expy, temp->expz);
        temp=temp->link;
    }
}

POLY *add_poly(POLY *h1, POLY *h2)
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
                case 2: temp2=temp2->link;
                        break;
            }
        }
        while(temp1!=h1)
        {
            attach(temp1->co_eff, temp1, &tempres);
            temp1=temp1->link;
        }
    }
    while(temp2!=h2)
    {
        attach(temp2->co_eff, temp2, &tempres)
        temp2=temp2->link;
    }
    tempres->link=res;
    return res;
}

void attach(int co, POLY *temp, POLY **tres)
{
    POLY *new=getnode();
    new->co_eff=co;
    new->expx=temp->expx;
    new->expy=temp->expy;
    new->expz=temp->expz;
    (*tres)->link=new;
    *tres=new;
}

void comp(POLY *t1, POLY *t2)
{
    if((t1->expx==t2->expx)&&(t1->expy==t2->expy)&&(t1->expz==t2->expz))
        return 1;
    return -1;
}


