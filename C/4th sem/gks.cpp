#include<iostream>
using namespace std;

int get_next(int n, float r[])
{
    float large=r[0];
    int index=-1;
    int i;
    for(i=1;i<n;i++)
    {  
        if(r[i]>large)
        {
            large=r[i];
            index=i;
        }
    }
    r[index]=-1;
    return index;
}


void knapsack(int n, float p[], float w[], float r[], int cap)
{
    int i, u;
    float x[10];

    int item;

    for(i=0;i<n;i++)
    {
        x[i]=0;
    }
    u=cap;
    while(u>=0)
    {
        item=get_next(n, r);
        if(w[item]>u)
        {
            break;
        }
        x[item]=1;
        u=u-w[item];
    }
    if(u>=0)
    {
        x[item]=u/w[item];
    }
    cout<<"x array:\n";
    for(i=0;i<n;i++)
    {
        cout<<x[i]<<"\t";
    }
    cout<<endl;
    float profit=0;
    for(i=0;i<n;i++)
    {
        profit=profit+(p[i]*x[i]);
    }
    cout<<"The optimal solution is:\n"<<profit;
}

int main()
{
    int n, i, cap;
    float r[10], p[10], w[10];
    cout<<"Enter the number of objects:\n";
    cin>>n;
    cout<<"Enter the weight of each object:\n";
    for(i=0;i<n;i++)
    {
        cin>>w[i];
    }
    cout<<"Enter the price of each object:\n";
    for(i=0;i<n;i++)
    {
        cin>>p[i];
    }
    cout<<"enter the capacity of the knapsack:\n";
    cin>>cap;
    cout<<"Calculating ratio......\n";

    for(i=0;i<n;i++)
    {

        r[i]=(p[i]/w[i]);
        cout<<r[i]<<"\t";
    }
    cout<<endl;
    knapsack(n, p, w, r, cap);
    return 0;
}
