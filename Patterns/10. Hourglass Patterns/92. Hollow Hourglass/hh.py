n = int(input("Enter a Number : "))

for i in range(1,2*n):
  
    row = min(i,2*n-i)

    for j in range(1,2*n):
        if(row==j or row==1 or row+j==2*n):
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
      *   *       
    *       *     
  *           *   
* * * * * * * * *          

                
'''