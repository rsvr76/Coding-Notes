n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(i,n+1): # for j in range(1,n-i+2):
        print(chr(ord('A')+j-i), end=" ") # write each iteration & you know why
    print()

'''

Use (i+j<=n+1) for optimized code & for n matrix 

Output:

A B C D E 
A B C D 
A B C 
A B 
A   
 
'''