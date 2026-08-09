n = int(input("Enter a Number : "))

for i in range(1,2*n):
    for j in range(1,2*n):
        if(i+j==n+1 or j-i==n-1 or i-j==n-1 or i+j==3*n-1):
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
*               *
  *           *   
    *       *
      *   *       
        *          

Another approach using an extra vaiable row

  for i in range(1,2*n):
  
    row = min(i,2*n-i)

    for j in range(1,2*n):
      if(row+j==n+1 || j-row==n-1):
        print("*",end=" ")
      else:
        print(end='  ')
    print()

        
'''