#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#define SIZE 100

struct employee
{
    int id;
    char name[SIZE];
    int sal;
    char gen;
};

void read_emp(int n, struct employee emp[]);
void print_emp(int n, struct employee emp[]);
void search_name(int n, struct employee emp[], char key[]);
void search_gen(int n, struct employee emp[], char genkey);

int main()
{
    struct employee emp[SIZE];
    int n, ch;
    char key[20], genkey;
    printf("Enter the number of employees:\n");
    scanf("%d",&n);
    printf("Enter the employee details:\n");
    read_emp(n,emp);
    printf("****************************************\n");
    printf("\n");
    
    for(;;)
    {
        printf("Choose an option:\n");
        printf("1. Search by Name\n2. Search by Gender\n 3. Display all Employee Details\n 4. Exit\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: printf("Enter the name to be searched:\n");
                    scanf("%s", &key);
                    search_name(n,emp,key);
                    break;
            case 2: printf("Enter a gender(m/f):\n");
                    scanf("%c ", &genkey);
                    search_gen(n,emp,genkey);
                    break;
            case 3: printf("The employee details are:\n\n");
                    print_emp(n,emp);
                    printf("****************************************\n");
                    printf("\n");
                    break;
            case 4: exit(0);
        }
    }
}

void read_emp(int n, struct employee emp[])
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("Employee %d\n",i+1);
        scanf("%d %s %d %s", &emp[i].id, &emp[i].name, &emp[i].sal, &emp[i].gen);
    }
}

void print_emp(int n, struct employee emp[])
{
    int i;
    printf("ID\tName\tSalary\tGender\n");
    printf("----------------------------------------\n");
    for(i=0;i<n;i++)
    {
        printf("%d\t%s\t%d\t%c\n", emp[i].id, emp[i].name, emp[i].sal, emp[i].gen);
    }
    
}

void search_name(int n, struct employee emp[], char key[])
{
    int i;
    for(i=0;i<n;i++)
    {
        if(!strcmp(key,emp[i].name))
        {
            printf("ID\tName\tSalary\tGender\n");
            printf("----------------------------------------\n");
            printf("%d\t%s\t%d\t%c\n", emp[i].id, emp[i].name, emp[i].sal, emp[i].gen);
            return;
        }  
    }
    printf("Invalid Name:\n");
}

void search_gen(int n, struct employee emp[], char genkey)
{
    int i;
    for(i=0;i<n;i++)
    {
        if(strcmp(genkey,emp[i].gen))
        {
            printf("ID\tName\tSalary\tGender\n");
            printf("----------------------------------------\n");
            printf("%d\t%s\t%d\t%c\n", emp[i].id, emp[i].name, emp[i].sal, emp[i].gen);
        }
        else continue;
    } 
}