# second largest
l=[1,2,3,4,5,6,7,8,9]
lar=l[0]
Slar=l[0]
for i in l:
      if i>lar:
            lar=i
print("Largest element is : ",lar)
for j in l:
       if j!=lar and j>Slar :
             Slar=j
print("Second largest element is : ",Slar)   