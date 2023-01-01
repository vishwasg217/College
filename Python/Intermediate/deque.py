import collections
from collections import deque

d = deque([1, 2, 3 ,4 ,5])

print(d)

d.append(6)
print(d)

d.appendleft(8)
print(d)

d.extend([8, 9, 1])
print(d)

d.extendleft([5, 4, 3])
print(d)

d.pop()
print(d)

d.popleft()
print(d)

d.remove(6)
print(d)

d.reverse()
print(d)

d.rotate(3)
print(d)

d.rotate(-5)
print(d)

x = deque('abcde', maxlen=6)
print(x)

x.append('g','h','i')
print(x)

