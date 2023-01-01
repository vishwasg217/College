n = int(input("Enter the number of elements"))

list1  = []

print("Enter the elements: ")
list1 = list(map(int, input().split(" ")))

key  = int(input("Enter the key: "))

def func(list, key):
    for i in range(len(list)):
        if list[i] == key:
            return i

print("key found at index: ", func(list1, key))

