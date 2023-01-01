/*
if a terminated processes information is still presnet in the process table of the kernel then it is termed as zombie process.
*/

/*
waitpid function proides 3 features that are not provided by wait function
1. waitpid can be called to wait for one particular process.
2. provides a non blocking version of wait.
    if required child's status can be fetched, but parent process need not be blocked.
3. waitpid function provides support for job control with the WUNTRACED and WCONTINUED options.
*/