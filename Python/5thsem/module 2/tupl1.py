t1 = (2, 9, 4)
l1 = [3, 6, 1]

l1.extend(t1)
#l1 += list(t1)


print(l1)

t1 += tuple(l1)

print(t1)