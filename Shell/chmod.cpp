#include<fcntl.h>
#include<unistd.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<string.h>
#include<iostream>

/*
Write a function that turns set_UID flag, removes grp write permission, and others read and execute permission on a given file
*/

void change_mode()
{
    struct stat statv;
    int flag=(S_IWGRP|S_IROTH|S_IXOTH);
    stat("x1.txt", &statv);
    flag=statv.st_mode & ~flag|S_ISUID;
    chmod("x1.txt", flag);
}

int main()
{
    
}