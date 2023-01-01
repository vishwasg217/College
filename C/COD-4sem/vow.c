#include<stdio.h>
#include<string.h>
void main()
{
    char sent[100], vow[100], cons[100];
    int v=0, c=0;
    printf("Enter a string:\n");
    gets(sent);
    for(int i=0;i<100;i++)
    {
        if(sent[i]=='a' || sent[i]=='e' || sent[i]=='i' || sent[i]=='o' || sent[i]=='u' || sent[i]=='A' || sent[i]=='E' || sent[i]=='I' || sent[i]=='O' || sent[i]=='U' )
        {
            vow[v]=sent[i];
            v++;
        }
        else
        {
            cons[c]=sent[i];
            c++;
        }
    }
    vow[v]='\0';
    cons[c]='\0';

    printf("Vowels\n");
    for(int i=0;i<100 ;i++)
    {
        printf("%c",vow[i]);
    }
    printf("\n");
    printf("Vowels\n");
    for(int j=0;j<100;j++)
    {
        printf("%c",cons[j]);
    }
}