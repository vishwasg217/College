#include<stdio.h>
 struct student
 {
    char name[25];
    int age;
    char sub_name[25];
    float marks;
 };

 void main()
 {
    struct student std[100];
    int n, i;
    printf("How many students:\n");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("Enter details of student %d:\n",i+1);
        scanf("%s %d %s %f",&std[i].name, &std[i].age, &std[i].sub_name, &std[i].marks);
    }
    for(i=0;i<n;i++)
    {
        printf("The details of student %d are:\n",i+1);
        printf("Name: %s\t Age: %d\t Subject: %s\t Marks: %f\n",std[i].name, std[i].age, std[i].sub_name, std[i].marks);
    }
    return;
 }