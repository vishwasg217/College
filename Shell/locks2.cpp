#include<fcntl.h>
#include<unistd.h>
#include<sys/stat.h>
#include<string.h>
#include<iostream>

using namespace std;
int main(int argc, char * argv[])
{
    struct flock fvar;
    int fd;
    if((fd=open(argv[1], O_RDWR))==-1)
        cout<<"error";
    fvar.l_type=F_RDLCK;
    fvar.l_whence=SEEK_SET;
    fvar.l_start=0;
    fvar.l_len=0;

    while(fcntl(fd, F_SETLK, &fvar)==-1)
    {
        while(fcntl(fd, F_GETLK, &fvar)!=-1)
        {
            cout<<argv[1]<<"locked by"<<endl;
            cout<<fvar.l_pid<<"from"<<fvar.l_start<<"for"<<fvar.l_len<<"bytes"<<"lock type is"<<(fvar.l_type=F_WRLCK?'w':'r')<<endl;

        }
    }
}

