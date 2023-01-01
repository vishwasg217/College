#include <stdio.h>
#define PI 3.14159          
void main()
{

    float radius, area,circum;
    printf("Enter the radius:");
    scanf("%f", &radius);

    area = PI * radius * radius;
    circum=2*PI*radius;

    printf("\nThe area of the circle is %f", area);
    printf("\nThe circumference of the circle is %f", circum);
   

}
