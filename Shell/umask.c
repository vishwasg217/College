#include <sys/stat.h>
#include<sys/types.h>
#include<fcntl.h>
#include<stdio.h>
#include<unistd.h>



int main()
{
    
    int fd3 = open("/Users/vishwasgowda/Desktop/Shell/vvv1.txt", O_RDONLY|O_CREAT, 0777);
    umask(054);
    printf("%d\n", fd3);
    close(fd3);
    return 0;
}