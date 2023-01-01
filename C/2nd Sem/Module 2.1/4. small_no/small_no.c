#include<stdio.h>
void main()
{
    int a, b, c;
    printf("Enter 3 Numbers:\n");
    scanf("%d %d %d", &a, &b, &c);

    if (a<c&&a<b)
    printf("%d is the smallest number",a);

        else if(b<a&&b<c)
        printf("%d is the smallest number",b);

        else
        printf("%d is the smallest number",c);
}
