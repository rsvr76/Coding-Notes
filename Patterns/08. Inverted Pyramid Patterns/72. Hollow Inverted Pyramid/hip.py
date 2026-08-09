n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(1,2*n):
        if(i==1 or i==j or i+j==2*n):
            print("*",end=" ")
        else:
            print(end='  ')
    print()

'''
Output:

* * * * * * * * * 
  *           *   
    *       *     
      *   *       
        *

'''