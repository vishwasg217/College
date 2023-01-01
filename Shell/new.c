#include<unistd.h>
#include<sys/types.h>
#include<fcntl.h>
#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
int main()
{
    int fd, sz;
    char c[20];
    fd = open("food.txt", O_RDONLY|O_CREAT, 0777);
    if(fd<0)
    {
        perror("r1");
        exit(0);
    }

    sz = read(fd, c, 20);
    printf("called read(%d, c, 10) returned that %d bytes were read\n", fd, sz);
    c[sz]='\0';
    printf("Those bytes are as follows %s\n", c);
}