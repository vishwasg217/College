def rev():
    string = input('Enter a string:')
    len = string.count('')
    if len <= 6:
        print("Invalid. Enter more than 6 characters\n")
    else: 
        print("Reversed string: ", string[::-1])