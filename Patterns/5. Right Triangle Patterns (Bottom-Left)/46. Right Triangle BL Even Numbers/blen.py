n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(i,n+1): # for j in range(1,n-i+2):
        print(2*(j-i+1), end=" ") # write each iteration & you know why
    print()

'''

Use (i+j<=n+1) for optimized code & for n matrix 

Output:

2 4 6 8 10 
2 4 6 8 
2 4 6 
2 4 
2  
 
'''