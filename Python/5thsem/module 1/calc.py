print("Enter two operators: ")
a=int(input())
b=int(input())
print("Enter operand: ")
op=input()

def func(a,b,op):
    if op=="+":
        return a+b
    elif op=='-':
        return a-b
    elif op=='*':
        return a*b
    elif op=='/':
        return a/b

print(func(a,b,op))