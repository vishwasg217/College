/*
Implement in Java, the 0/1 Knapsack problem using
(a) Dynamic Programming method
(b) Greedy method.
 */

import java.util.Scanner;

public class GreedyKnapsack
{
    public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int n = in.nextInt();
        float[] w = new float[n];
        float[] p = new float[n];
        float[] r= new float[n];
        System.out.println("Enter the weight of each objects: ");
        for(int i=0;i<n;i++)
        {
            w[i]=in.nextInt();
        }
        System.out.println("Enter the price of each objects: ");
        for(int i=0;i<n;i++)
        {
            p[i]=in.nextInt();
        }
        System.out.println("Enter the capacity of the knapsack: ");
        int c = in.nextInt();
        System.out.println("Calculating ratio....");
        for(int i=0; i<n; i++)
        {
            r[i]=p[i]/w[i];
        }
        
        gks(n, w, p, c, r);
        in.close();
    }

    static void gks(int n, float[] w, float[] p, int c, float[] r)
    {
        int i;
        float u;
        float[] x = new float[n];
        int item=0;

        for(i=0;i<n;i++)
        {
            x[i]=0;
        }

        u=c;
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
        
        float profit=0;
        
        for(i=0;i<n;i++)
        {
            profit=profit+(p[i]*x[i]);
        }
        System.out.println("Optimal solution: " + profit);
        }

    private static int get_next(int n, float[] r) 
    {
        float large=r[0];
        int index=0;
        for(int i=1;i<n;i++)
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
}

/*
OUTPUT:

Enter the number of objects:
3
Enter the weight of each objects:
18 15 10
Enter the price of each objects:
25 24 15
Enter the capacity of the knapsack:
20
Calculating ratio....
Optimal solution: 31.5
 */