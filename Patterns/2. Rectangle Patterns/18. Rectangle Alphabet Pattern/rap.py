l = int(input("Enter the Length : "))
b = int(input("Enter the Breadth : "))

for i in range(1,l+1):
    for j in range(1,b+1):
        print(chr(ord('A')+j-1),end = ' ')
    print()

'''
Output:

A B C D E F G 
A B C D E F G 
A B C D E F G 
A B C D E F G 
A B C D E F G 
'''