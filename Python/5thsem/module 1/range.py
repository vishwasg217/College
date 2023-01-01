for x in range(100, 200):
    sum=0
    y=x
    while(y>0):
        rem=y%10
        sum=sum+rem
        y=y//10
    if(sum%2==0):
        print(x)

