def add(x):
    return x+10

def odd(x):
    return x%2 != 0

a = [1,2,3,4,5,6,7,8,9,10]

b = list(filter(odd,a))

c = list(map(add, filter(odd, a)))

print(a)
print('\n')
print(b)
print(c)