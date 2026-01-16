# fibo series
a=1
b=1
print(a)
print(b)
sum_F=0
while(sum_F<100):
     sum_F=a+b
     print(sum_F)
     a=b
     b=sum_F
# fibbo serie using for loop
a=0
b=1
for i in range(10):
     print(a)
     c=a+b
     a=b
     b=c

# revisison of fibo series using for loop
a=0
b=1
sum=0
for i in range(50):
     print(a)
     c=a+b
     a=b
     b=c
