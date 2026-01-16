# Sum of elements:
l=[1,2,3,4,5,6,7,8,9]
sum_e=0
for i in l:
     sum_e=sum_e+i
print("The sum of all elements is: ",sum)
#Remove the duplicate elements from list using set:
s={1,1,2,3,3,4,4,5,5,6,7,6,7,8,9,4}
print("The duplicate free list is : ")
for i in s:
     print(i,end=" ")
print("")
# reverse elements 
print("The Reverse Array is : ")
arr=[1,2,3,4,5,6,7,8,9]
for i in range(len(arr)-1,-1,-1):
     print(arr[i],end=" ")