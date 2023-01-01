#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[], char *argp[])
{
    printf("Environment list\n");
    while(*argp!=NULL)
    {
        printf("%s\n", *argp);
        *argp++;
    }
    
}