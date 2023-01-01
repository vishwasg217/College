/*
int sigprocmask(int change,
                const sigset_t  *set,
                      sigset_t  *oset);
change

If the signal set pointed to by the set parameter is not NULL, the change parameter indicates the way in which the signal mask (the set of signals currently blocked) is changed. This parameter must be specified as one of the following:

SIG_BLOCK
All signals in the signal set pointed to by the set parameter are to be added to the current signal set for the process.

SIG_SETMASK
The signal set pointed to by the set parameter replaces the current signal mask for the process.

SIG_UNBLOCK
All signals in the signal set pointed to by the set parameter are to be removed from the current signal set for the process.
If the signal set pointed to by the set parameter is NULL, the change parameter is ignored.


set
One of the following:

A pointer to a signal set that is used to modify the signal mask according to the change parameter. The signal set is of the sigset_t type.
If the oset parameter is a pointer to a signal set, the value of the signal mask before the sigprocmask function call is stored in the signal set referenced by the oset parameter, and the signal mask is changed as specified by the change and set parameters.
If the oset parameter is NULL, the signal mask is changed as specified by the change and set parameters.
A value of NULL.

If the oset parameter is a pointer, the value of the signal mask stored in the signal set referenced by the oset parameter and the signal mask is not changed.
If the oset parameter is NULL, the signal mask is not examined or changed.


oset
One of the following:

A pointer to a signal set where the signal mask for the process is stored when the sigprocmask function is called. The signal set is of the sigset_t type.
A value of NULL
*/

#include<signal.h>
#include<stdio.h>
#include<stdlib.h>
int main()
{
    sigset_t s;
    sigemptyset(&s);
    if(sigprocmask(0, 0, &s)==-1)
    {
        perror("sigprocmask");
        exit(1);

    }
    else sigaddset(&s, SIGINT);
    sigdelset(&s, SIGSEGV);
    sigprocmask(SIG_SETMASK, &s, 0);
    return 0;
}

