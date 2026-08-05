n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(i,n+1): # for j in range(1,n-i+2)
        print(2*(j-i+1)-1, end = ' ') # write each iteration & you know why
    print()

'''

Use (i+j<=n+1) for optimized code & for n matrix 

Output:

1 3 5 7 9 
1 3 5 7 
1 3 5 
1 3 
1 

'''