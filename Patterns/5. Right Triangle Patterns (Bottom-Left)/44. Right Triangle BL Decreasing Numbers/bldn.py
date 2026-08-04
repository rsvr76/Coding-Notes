n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(n,i-1,-1): # for j in range(1,n-i+2):
        print(j,end=" ")
    print()

'''

Use (i+j<=n+1) for optimized code & for n matrix 

Output:

5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5  
 
'''