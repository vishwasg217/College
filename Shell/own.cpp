#include<fcntl.h>
#include<unistd.h>
#include<sys/stat.h>
#include<sys/types.h>
#include<string.h>
#include<iostream>
#include<pwd.h>
#include<stdlib.h>

int main(int argc, char *argv[])
{
    struct passwd *pwd  = getpwuid(atoi(argv[1]));
    struct stat statv;
    if (stat(argv[2], &statv)==0)
    {
        chown(argv[2], pwd->pw_uid, statv.st_gid);
    }
    else
    perror("stat");
    return 0;
}