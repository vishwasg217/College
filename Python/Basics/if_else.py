age=input('Enter your age:')
if int(age)<18:
    print('You are underaged')
elif int(age)>=18 and int(age)<=65:
    print('You are an adult')
else: 
    print('You are a senior citizen')