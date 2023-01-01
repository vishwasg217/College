#include<fcntl.h>
#include<unistd.h>
#include<sys/stat.h>
#include<string.h>
#include<iostream>
using namespace std;
int main(int argc, char *argv[])
{
    if(argc!=3||!strcmp(argv[1], argv[2]))
    {
        cout<<"usage: "<<argv[0]<<"src_file dest_file\n";
        return 0;
    }

    int fd=open(argv[1], O_RDONLY, 0777);
    lseek(fd, -50, SEEK_END);
    char c[60];
    read(fd, &c, 50);

    int fd2=open(argv[2], O_CREAT|O_RDWR, 0777);
    write(fd2, c, strlen(c));

}