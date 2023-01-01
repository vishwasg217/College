#you have x number of 5 rupee coins and y number of 1 rupee coins
# you want to purchase an item for amount z
# shopkeeper wants you to provide exact change
# you want to pay using minimum number of points
# how many 5 ruppee coins and 1 ruppee coins will you use?
# if exact change is not possible, you can display -1
# imput: y=2 x=4 z=21

x = int(input("Enter the number of 5 ruppee coins: "))
y= int(input("enter number of 1 ruppee coins: "))
z = int (input("Enter the amount: "))

def func(x, y, z):
    coins_5 = z//5
    z = z%5
    coins_1 = z//1
    if coins_5 <= x and coins_1 <= y:
        print("5 rupee coins: ", coins_5, end="\n")
        print("1 rupee coins: ", coins_1, end="\n")
    else:
        print("-1")

func(x, y, z)
    
