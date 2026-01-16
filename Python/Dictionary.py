#Dictionary in list
l=[1,1,2,2,3,3,3,3,4,4,4,5,5,5,5,6,6,6,6,7,7,7]
f={}
for i in l:
    if i in f:
        f[i]=f[i]+1
    else:
        f[i]=1
print(f)
# Dictionary in string 
name= "programming"
f={}
for i in name:
    if i in f:
        f[i]=f[i]+1
    else : 
        f[i]=1
print(f)
# counting word frequency in sentance
sentance="I love AI and I love Python"
f={}
word=sentance.split()
for i in word:
    if i in f:
        f[i]=f[i]+1
    else :
        f[i]=1
print(f)
# non repeting first char in string
name="Programming"
f={}

for i in name:
    if i in f:
        f[i]=f[i]+1
    else:
        f[i]=1
print(f)
for ch in name:
    if f[ch]==1:
        ch==f[i]
        print(ch)
        break

