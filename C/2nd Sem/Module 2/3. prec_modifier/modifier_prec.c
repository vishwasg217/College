#include<stdio.h>
 int main()
 {
   float num = 9.2356;
   
   printf("num = %.1f\n",num);
   printf("num = %.3f\n",num);
   printf("num = %.5f\n",num);
   
   printf("num = %3.1f\n",num);
   printf("num = %5.2f\n",num);
   printf("num = %10.3f\n",num);
   
   return 0;
 }