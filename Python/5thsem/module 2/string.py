a  = "hello everyone, my name is vishwas"

if len(a) >= 2:
    b = a[0:2] + a[-2:len(a)]
    print(b)
else:
    print()

b = "drinking"

if b[-3:] == "ing":
    c = b + "ly"
else:
    c = b + "ing"

print(c)

d = "hello,hello,my,name,is,vishwas"

list1 = d.split(",")

list1.sort()

for i in range(len(list1)-2):
    if list1[i] == list1[i+1]:
        list1.remove(list1[i+1])
print(list1)