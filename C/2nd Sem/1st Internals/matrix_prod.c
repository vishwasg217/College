#include <stdio.h>
#include <stdlib.h> 
  
int main()
{
  int m, n, p, q, c, d, k, sum = 0;
  int f[10][10], s[10][10], prod[10][10];
 
  printf("Enter the number of rows and columns of first matrix: ");
  scanf("%d %d", &m, &n);

 
  printf("Enter number of rows and columns of second matrix: ");
  scanf("%d %d", &p, &q);
 
  if (n!=p)
  {
    printf("The matrices cannot be multiplied.\n");
	exit(0);
  }
  else
  {
	  
	printf("Enter the elements of first matrix: ");
 
	for (c=0; c<m; c++)
		for (d=0; d<n; d++)
			scanf("%d", &f[c][d]);
  
    printf("Enter elements of second matrix: ");
 
    for (c=0; c<p; c++)
      for (d = 0; d<q; d++)
        scanf("%d", &s[c][d]);
 
    for (c=0; c<m; c++) 
	{
      for (d=0; d<q; d++) 
	  {
        for (k = 0; k < p; k++) 
		{
          sum = sum + f[c][k]*s[k][d];
        }
 
        prod[c][d] = sum;
        sum = 0;
      }
    }
 
    printf("Product: \n");
 
    for (c = 0; c < m; c++) {
      for (d = 0; d < q; d++)
        printf("%d\t", prod[c][d]);
 
      printf("\n");
    }
  }
 
  return 0;
}