#include<sys/types.h>
#include<fcntl.h>
#include<stdio.h>
#include<unistd.h>

//int open(const char *path, int access_mode, mode_t permission);


int main()
{
    int fd = open("/Users/vishwasgowda/Desktop/Shell/emp.txt", O_RDONLY, 0);
    int fd2 = open("/Users/vishwasgowda/Desktop/Shell/abc", O_RDONLY, 0);
    int fd3 = open("/Users/vishwasgowda/Desktop/Shell/xyz.txt", O_RDONLY|O_CREAT, 0764);
    printf("%d  %d\n", fd, fd2);
    printf("%d\n", fd3);
    close(fd);
    return 0;
}
