#include<fcntl.h>
#include<unistd.h>
#include<sys/stat.h>
#include<string.h>
#include<iostream>

int main()
{
    int fd=open("abc.txt", O_WRONLY, 0);
    char a[20]={"HELLO"};
    lseek(fd, 30, SEEK_SET);
    write(fd, a, strlen(a));
    close(fd);
    

}