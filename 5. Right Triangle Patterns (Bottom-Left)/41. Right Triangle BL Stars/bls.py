n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(i,n+1): # for j in range(1,n-i+2):
        print("*",end=" ")
    print()

'''

Use (i+j<=n+1) for optimized code & for n matrix 

Output:

* * * * * 
* * * * 
* * * 
* * 
* 
 
'''