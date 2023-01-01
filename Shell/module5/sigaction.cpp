/*
https://www.ibm.com/docs/en/zos/2.1.0?topic=functions-sigaction-examine-change-signal-action
*/
#include<signal.h>
#include<unistd.h>
#include<iostream>
#include <cstdlib>
#include<string>
#include<stdio.h>
using namespace std;
void main(int argc, char *argv[])
{
    struct sigaction act;
    sigset_t set;
    sigemptyset(&set);
    sigaddset(&set, SIGTERM);
    sigaddset(&set, SIGTSTP);
    act.sa_flags=0;
    act.sa_mask=set;
    act.sa_handler = & handler;
    sigaction(SIGINT, &act, NULL);
    cin.get();
    cout<<argv[0]<<"exits";
}

void handler(int signum)
{
    cout<<"caught signal"<<signum;
}