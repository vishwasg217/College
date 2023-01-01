#include<utime.h>
#include<stdlib.h>
#include<time.h>
int main(int argc, char *argv[])
{
    struct utimbuf times;
    int offset  = atoi(argv[1]);
    times.actime = times.modtime = time(0)+offset;
    utime(argv[2], &times);
    return 0;
}