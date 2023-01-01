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
    if(link(argv[1], argv[2])==0)
    {
        return unlink(argv[1]);
    }
    return -1;
}