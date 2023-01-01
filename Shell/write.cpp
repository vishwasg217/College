#include<unistd.h>
#include<sys/types.h>
#include<fcntl.h>
#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<string.h>
int main()
{
    int fd, sz;
    char c[20];
    fd = open("food1.txt", O_RDWR|O_CREAT|O_APPEND, 0777);
    if(fd<0)
    {
        perror("r1");
        exit(0);
    }

    char z[30] = {"happy"};
    write(fd, z, strlen(z));
    strcpy(z, "12");
    write(fd, z, strlen(z));
    strcpy(z, "12.23");
    write(fd, z, strlen(z));
    close(fd);
}