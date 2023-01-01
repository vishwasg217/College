num = [1,2,3,4,5,6,7,8,9,10]

def func(x):
    return x**2

#how it is normally done
listnum = []
for i in num:
    listnum.append(func(i))

print(listnum)


print("\nmapping:")
#using map function
print(list(map(func, num)))