/*
SIGINT
produces a receipt for an active signal

SIGTERM
Sends a termination request to the program

SIGBUS
Bus error which indicates access to an invalid address

SIGILL
Detects an illegal command

SIGALRM
This is used by the alarm() function and indicates the expiration of the timer.

SIGABRT
Termination of a program, abnormally

SIGKILL
generated using kill -9 command

SIGSTOP
The signal cannot be blocked, handled, and ignored and can stop a process

SIGSEGV
Invalid access to storage

SIGFPE
Overflow operations or mathematically incorrect operations like divide by zero

SIGUSR1
SIGSUR2
User-Defined Signals
*/


#include<signal.h>
#include<unistd.h>
#include<iostream>
#include <cstdlib>
#include<string>
using namespace std;

int main()
{
    cout<<getpid();
    string foo;
    signal(SIGTERM, SIG_DFL);
    cin.get();
    return 0;
}

/*
signals are triggered by events and are hosted on a process to notify it that something has happened and requires some action.

*/