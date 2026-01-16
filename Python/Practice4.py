# reverse practice
l=[2,3,4,5,6,7,8,9]
for i in range(len(l)-1,-1,-2):
    print(l[i],end="")
print("\n")
# reverse string 
name = "Prajakta"
for i in range(len(name)-1,-1,-1):
    print(name[i],end="")
print("\n")
# count digit in number
num=12345
count_d=0
while(num>0):
    num%10
    num=num//10 # for remove the last digit from number
    count_d=count_d+1
print("The number of digit in num is : ",count_d)
# fibbo series
a=1
b=1
print(a)
print(b)
sum=0
while(sum>20):
    sum=a+b
    a=b
    b=sum
    print(sum)


   

