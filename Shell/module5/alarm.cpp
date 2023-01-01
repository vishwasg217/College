#include<signal.h>
#include<unistd.h>
#include<iostream>
#include <cstdlib>
#include<string>
#include<stdio.h>
using namespace std;

unsigned int sleep(unsigned int timer)
{
    struct sigaction action;
    action.sa_handler=wakeup;
    action.sa_flags=0;
    sigemptyset(&action.sa_flags);
    sigaction(SIGALRM, &action, 0);
    alarm(3);
    cin.get();

}

void wakeup(int num)
{
    if(num==SIGALRM)
    {
        kill(getpid(), SIGTERM);
    }
}

int main()
{
    signal(SIGALRM, wakeup);
    alarm(5);
    while(1)
    {
        cout<<"Normal execution";
        return 0;
    }
}