print("Enter the elements: ")
list1 = list(map(int, input().split(" ")))

sum = 1

for x in list1:
    sum = sum * x

print("Sum: ", sum)  