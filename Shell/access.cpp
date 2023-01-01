/*Write a c pgm that uses access for each cmd line argument whether a named fule exists.
If a named file does not exist, it should be created and intiialized with a character string hello world.
However if named file does exist, the pgm will simply read date from the file and display the content.*/

#include<fcntl.h>
#include<unistd.h>
#include<sys/stat.h>
#include<string.h>
#include<iostream>

int main(int argc, char *argv[])
{
    int fd;
    
    printf("%d", argc);

    for(int i=1;i<argc;i++)
    {
        int check=access(argv[i], F_OK);
        if(check==-1)
        {
            fd = open(argv[i], O_RDWR|O_CREAT, 0777);
            write(fd, "Hello World\n", 12);
            printf("New file created");
            close(fd);
        }
        else
        {
            fd = open(argv[i], O_RDONLY, 0);
            char c[250];
            read(fd, &c, 250);
            printf("%s\n", c);
            close(fd);
        }
    }
    
}
