#find no in given range
num=int(input("Enter a number"))
a=int(input("Enter lowere limit"))
b=int(input("Enter upper limit"))



def func(num, a, b):
    if num in range(a,b):
        print(True)
    else:
        print(False)

func(num, a, b)


