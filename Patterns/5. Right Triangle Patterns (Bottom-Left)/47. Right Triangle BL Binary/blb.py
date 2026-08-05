n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(i,n+1): # for j in range(1,n-i+2):
        print((j-i+1)%2, end=" ") # write each iteration & you know why
    print()

'''

Use (i+j<=n+1) for optimized code & for n matrix 

Output:

1 0 1 0 1 
1 0 1 0 
1 0 1 
1 0 
1   
 
'''