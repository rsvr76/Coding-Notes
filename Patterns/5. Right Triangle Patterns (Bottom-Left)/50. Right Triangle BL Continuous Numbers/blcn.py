n = int(input("Enter a Number : "))
num=1

for i in range(1,n+1):
    for j in range(i,n+1): # for j in range(1,n-i+2):
        print(f"{num:3}", end='') 
        num+=1
    print()

'''

Use (i+j<=n+1) for optimized code & for n matrix 

Output:

  1  2  3  4  5
  6  7  8  9
 10 11 12
 13 14
 15 
 
'''