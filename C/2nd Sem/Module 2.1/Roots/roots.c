#include<stdio.h>
#include<math.h>
void main()
{
    float a, b, c, det;
    float r1, r2, real, imag;
    printf("Enter a,b,c values:\n");
    scanf("%f %f %f",&a,&b,&c);

    if(a==0 && b==0)
    {
        printf("Input is invalid\n\n");
        printf("Try Again\n");
    }
        else if(a==0)
        {
            printf("Linear Equation\n");
            r1= -c/b;
            printf("Root = %f ",r1);
        }
        else
        {
            det=b*b-4*a*c;

            if(det==0)
            {
                r1=r2=-b/(2*a);
                printf("Roots are real and equal\n");
                printf("Root 1 = %f \t Root 2 = %f",r1,r2);
            }
                else if(det>0)
                {
                    r1=(-b+sqrt(det))/(2*a);
                    r2=(-b-sqrt(det))/(2*a);
                    printf("Roots are real and different\n");
                    printf("Root 1 = %f \t Root 2 = %f",r1,r2);
                }
                else
                {
                    real=-b/(2*a);
                    imag=(sqrt(fabs(det)))/(2*a);
                    printf("Roots are complex and different\n");
                    printf("Root 1 = %f + i%f \t",real, imag);
                    printf("Root 2 = %f - i%f",real, imag);
                }
        }

}