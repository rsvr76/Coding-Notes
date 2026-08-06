n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(1,2*n):
        if(i+j==6 or j-i==4 or i==n):
            print("*",end=" ")
        else:
            print(end='  ')
    print()

'''
Output:

        *         
      *   *       
    *       *     
  *           *   
* * * * * * * * * 

'''