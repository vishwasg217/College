#include<stdio.h>
#include<stdlib.h>
void main()
{
    int *ptr, n, i, new_size;
    char c;
    ptr=(int*)calloc(n,sizeof(int));
    if(ptr==NULL)
    {
        printf("No memory available:\n");
        return;
    }
    printf("Enter the number of elements:\n");
    scanf("%d",&n);
    printf("Enter the array elements:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",(ptr+i));
    }
    printf("The elements are:\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t", *(ptr+i));
    }
    printf("\nDo you want to enter new elements to the array [Y/N]?\n");
    scanf("%c",&c);
    if(c=='Y')
    {
        printf("Enter the new size:\n");
        scanf("%d",&new_size);
        ptr=(int*)realloc(ptr,(n+new_size)*sizeof(int));
        if(ptr==NULL)
        {
            printf("No memory available\n");
            return;
        }
        printf("Enter the elements:\n");
        for(i=n;i<(n+new_size);i++)
        {
            scanf("%d",(ptr+i));
        }
        for(i=0;i<n;i++)
        {
            printf("%d\t", *(ptr+i));
        }

    }

}