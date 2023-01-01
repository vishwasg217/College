#include<stdio.h>
void main()
{
    int x=0, y=6, z;
    z=(x&&y);
    printf("z=%d\n",z);
    z=(x||y);
    printf("z=%d\n",z);
    z=!(x&&y);
    printf("z=%d",z);
}