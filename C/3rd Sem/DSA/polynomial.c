#include<stdio.h>
#define MAX_TERMS 100
void poly_add(int sa, int fa, int sb, int fb, int *sd, int *fd);
int comp(int a, int b);
struct polynomial
{
    float co_eff;
    int exp;
};
struct polynomial poly[MAX_TERMS];
int avail;
int main()
{
    int sa, fa, sb, fb,sd,fd, na, nb, i;
    printf("Enter the number of terms in 1st polynomial:\n");
    scanf("%d",&na);
    printf("Enter co-efficients and exponents of 1st polynomial:\n");
    sa=0;
    for(i=sa;i<na;i++)
    {
        scanf("%f %d",&poly[i].co_eff,&poly[i].exp);
    }
    fa=i-1;
    sb=i;
    printf("Enter the number of terms in 2nd polynomial:\n");
    scanf("%d",&nb);
    printf("Enter co-efficients and exponents of 2nd polynomial:\n");
    for(i=sb;i<(na+nb);i++)
    {
        scanf("%f %d",&poly[i].co_eff,&poly[i].exp);
    }
    fb=i-1;
    avail=i;
    poly_add(sa,fa,sb,fb,&sd,&fd);
    printf("Sum = ");
    for(i=sd;i<=fd;i++)
    {
        if(poly[i].co_eff>=0)
            printf("+%.1fx^%d ",poly[i].co_eff,poly[i].exp);
        else 
            printf("-%.1fx^%d ",poly[i].co_eff,poly[i].exp);
    }
    return 0;
}

int comp(int a, int b)
{
    if(a<b)
    {
        return -1;
    }
    else if(b>a)
    {
        return 1;
    }
    else 
    return 0;
}

void attach(float co, int ex)
{
    poly[avail].co_eff=co;
    poly[avail].exp=ex;
    avail++;
}

void poly_add(int sa, int fa, int sb, int fb, int *sd, int *fd)
{
    float co_add;
    *sd=avail;
    while((sa<=fa)&&(sb<=fb))
    {
        switch(comp(poly[sa].exp,poly[sb].exp))
        {
            case -1: attach(poly[sb].co_eff,poly[sb].exp);
                     sb++;
                     break;
            case 1: attach(poly[sa].co_eff,poly[sa].exp);
                    sa++;
                    break;
            case 0: co_add=poly[sa].co_eff+poly[sb].co_eff;
                    attach(co_add,poly[sa].exp);
                    sa++;
                    sb++;       
        }
    }
    for(;sa<=fa;sa++)
    {
        attach(poly[sa].co_eff,poly[sa].exp);
    }
    for(;sb<=fb;sb++)
    {
        attach(poly[sb].co_eff,poly[sb].exp);
    }
    *fd=avail--;
}


