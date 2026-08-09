n = int(input("Enter a Number : "))
num=1
for i in range(1,n+1):
    for j in range(1,n+1):
        if (i==1 or i==n or j==1 or j==n):
            print(f"{num:3}", end = " ") # for output
        else:
            print(" ", end = "   ")
        num+=1
    print()
        
'''
Output:

  1   2   3   4   5 
  6              10 
 11              15 
 16              20 
 21  22  23  24  25  
'''