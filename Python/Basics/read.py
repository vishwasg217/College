file=open('text.txt','r')
f=file.readlines()
newlist=[]

for line in f:
    newlist.append(line.strip())    #to remove '\n' from the list

print(newlist)
