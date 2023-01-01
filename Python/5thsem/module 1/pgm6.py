#fib series using recursion

n=int(input("Enter a number"))

def func(n):
    if n<2:
        return n
    return func(n-1)+func(n-2)


for i in range(n):
    print(func(i))