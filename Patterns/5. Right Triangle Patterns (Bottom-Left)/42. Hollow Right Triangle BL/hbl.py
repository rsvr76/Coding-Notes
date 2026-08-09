n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(i,n+1): # for j in range(1,n-i+2): --> if(i==1 or j==1 or i+j==n+1)
        if(i==1 or j==i or j==n): # write each iteration & you know why
            print("*",end=" ")
        else:
            print(end="  ")
    print()

'''

Use (i+j<=n+1) for optimized code & for n matrix 

Output:

* * * * * 
*     * 
*   * 
* * 
*  
 
'''