#include<stdio.h>
void main()
{
    int c1=0, c2=0, c3=0, c4=0, c5=0;
    char c;
    printf("Enter a vowel:\n");
    scanf("%c",&c);

    if(c=='a'||c=='A')
    {c1++;
    printf("%d %d %d %d %d",c1, c2, c3, c4, c5);}


        else if(c=='e'||c=='E')
        {c2++;
        printf("%d %d %d %d %d",c1, c2, c3, c4, c5);}

        else if(c=='i'||c=='I')
        {c3++;
        printf("%d %d %d %d %d",c1, c2, c3, c4, c5);}

        else if(c=='o'||c=='O')
        {c4++;
        printf("%d %d %d %d %d",c1, c2, c3, c4, c5);}

        else if(c=='u'||c=='U')
        {c5++;
        printf("%d %d %d %d %d",c1, c2, c3, c4, c5);}

        else
        {printf("Character entered is a consonant");}
    
}