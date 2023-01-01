#it use to shorten the functon definition, especially when there is only one equation or return statement

def func(x):
    return x*2

func2 = lambda x,y: x**y

a = [1,2,3,4,5]

newlist = list(map(lambda x: x+5, a))

print(func(4))
print(func2(3,3))
print(newlist)