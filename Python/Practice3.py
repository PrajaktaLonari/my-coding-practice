l=[4,5,6,7,8,9,3,2,1]
sum=0
max=l[0]
min=l[0]
count_e=0
count_o=0
Slar=l[0]
rev_name=""
for i in l:
    sum=sum+i
    if i>max:
        max=i
    if i<min:
        min=i
print("The sum is : ",sum)
print("THe max number is : ",max)
print("The min number is : ",min)
for j in l:
    if j%2==0:
        count_e=count_e+1
    else:
        count_o=count_o+1
print("The odd numbers are : ",count_o)
print("The even numbers are : ",count_e)

a=['a','e','i','o','u']
name="madam"
count_v=0
for k in name:
    if k in a:
        count_v=count_v+1
print("Number Vowels in string are : ",count_v)

s={1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,5,4,5,6,7,8,9,8,7,6,5,4,3,2,1}
print("Using set we removed the duplicate elements ")
print(s)

#for second largest according on 1st list
for m in l:
    if m!=max and m>Slar:
        Slar = m
print("Second largest element in list is : ",Slar)
print("The reverse list is : ")
for n in range(len(l)-1,-1,-1):
    print(l[n],end=" ")
print("\n")
print("The Revrerse String is : ")
for p in range(len(name)-1,-1,-1):
    print(name[p],end="")
    rev_name=rev_name+name[p]
print("\n")
print(rev_name)
if name==rev_name:
    print("The String is Palindrome.")
else :
    print("The string is not Palindrome.")