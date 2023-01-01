#include<stdio.h>
 int main()
 {
   printf("Pad with leading zeroes");  
   printf("1. Number = %05.2f\n",3.23);
   printf("2. Number = %09.3f\n\n",3.23);
   
   printf("Display sign of the value");
   printf("1. Number = %d\n",-1.1);
   printf("2. Number = %+.2f\n",-1.1);
   printf("3. Number = %+5.2f\n\n",-1.1);

    printf("Without - flag:\n");
   printf("1. Number = %+6.1f\n",-5.9);
   printf("2. Number = %+10.3f\n\n",2.2);
   
   printf("With - flag:\n");
   printf("1. Number = %-+6.1f\n",-5.9);
   printf("2. Number = %-+10.3f\n\n",2.2);

   return 0;
 }