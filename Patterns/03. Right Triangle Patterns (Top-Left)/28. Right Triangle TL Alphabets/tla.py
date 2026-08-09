n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(1,i+1):
        print(chr(ord('A')+j-1), end = " ")
    print()

'''
Output:

A 
A B 
A B C 
A B C D 
A B C D E
    
'''