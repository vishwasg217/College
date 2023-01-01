#include<fcntl.h>
#include<unistd.h>
#include<sys/stat.h>
#include<string.h>
#include<iostream>
using namespace std;

void display1(int st_mode)
{
    switch(st_mode & S_IFMT)
    {
        case S_IFDIR: cout<<'d';
                        return;
        case S_IFCHR: cout<<'c';
                        return;
        case S_IFBLK: cout<<'b';
                        return;
        case S_IFREG: cout<<'-';
                        return;
        case S_IFLNK: cout<<'l';
                        return;
        case S_IFIFO: cout<<'f';
                        return;
        
    }
}

int main(int argc, char *argv[])
{
    struct stat statv;
    lstat(argv[1], &statv);
    display1(statv.st_mode);
    return 0;
}



