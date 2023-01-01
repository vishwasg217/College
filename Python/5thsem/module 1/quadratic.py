import math


print("Enter constant values: ")
a=int(input())
b=int(input())
c=int(input())

d=(b*b)-(4*a*c)

if(d==0):
    x=y=-b/(2*a)
else:
    x=float((-b+math.sqrt(d))/(2*a))
    y=float((-b-math.sqrt(d))/(2*a))


print(x," ", y)

