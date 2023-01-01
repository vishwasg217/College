list1 = ["abc", "def", "ghi"]
list2 = ["xyz", "def"]

list1  = list1 + list2

print(list1)

list1[0], list1[-1] = list1[-1], list1[0]

print(list1)

list1.sort(reverse=True)

for x in list1:
    print(x)