l=[10,20,30,40,50,60,70,80,90,1,2,3,4,5,6,7,8,9]
#1
l_sum=0
for i in l:
    l_sum=l_sum+i
print("The sum of all elements is ",l_sum)
#2&3
max=l[0]
min=l[0]
for i in l:
    if i>max:
        max=i
    if i<min:
        min=i
print("The max and min elements are ",max,"&",min)
#4&5
e_c=0
o_c=0
for i in l:
    if i%2==0:
       e_c=e_c+1
    if i%2!=0:
       o_c=o_c+1
print("The number of even and odd elements are ",e_c,"&",o_c)
# 6
fl=max
sl=l[0]
for i in l:
    if(i!=fl and i>sl):
        sl=i
print("Second largest element in list is ",sl)
#7
for i in range(len(l),0,-1):
    print(i,end=",")
print("")
#8
set={1,1,2,3,4,5,6,5,4,3,2,1}
print(set)
#9
l=['a','e','i','o','u']
name="programming"
c_v=0
for i in name:
    if i in l:
        c_v=c_v+1
print("The vowel in name is : ",c_v)
#10
rev=""
for i in range(len(name)-1,-1,-1):
   rev=rev+name[i]
print(rev)





