#include<signal.h>
#include<unistd.h>
#include<iostream>
#include <cstdlib>
#include<string>
#include<stdio.h>
using namespace std;

int main(int argc, char *argv[])
{
    int pid, sig=SIGTERM;
    if(argc>2)
    {
        pid=atoi(argv[1]);
        kill(pid, sig);
    }

}

