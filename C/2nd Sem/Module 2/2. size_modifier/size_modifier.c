#include<stdio.h>
#include<stdio.h>
 int main()
 {
   short int n1 = 12;
   long int n2 = 123456;
   long long int n3 = 5060626500325;
   long double n4 = 556626.36595;
   
   printf("n1 = %hd\n",n1);
   printf("n2 = %ld\n",n2);
   printf("n3 = %lld\n",n3);
   printf("n4 = %Lf\n",n4);

   return 0;
 }