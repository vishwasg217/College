import collections
from collections import Counter


a = Counter('Vishwas')
print(a)
print(a.most_common(1))

b = 'Vishwas'
print(Counter(b))


c = Counter(car = 4, bike = 2)
print(c)

print(list(c.elements()))

d = Counter(car = 3, bike  = 4)
print(d)

c.subtract(d) #subtracts d items from c items
print(c)

c.update(d)
print(c)

print(c+d) #same as update, but removes items <=0
print(c-d) #same as subtract, but removes items <=0

print(c & d) #shows the minumum elements in each counter
print(c | d) #shows the max elements in each counter