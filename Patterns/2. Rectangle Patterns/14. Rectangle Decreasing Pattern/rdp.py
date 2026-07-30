l = int(input("Enter the Length : "))
b = int(input("Enter the Breadth : "))

for i in range(1,l+1):
    for j in range(b,0,-1): # we are printing j, so don't need to change the order of i
            print(j, end=' ')
    print()

'''
Output:

7 6 5 4 3 2 1 
7 6 5 4 3 2 1 
7 6 5 4 3 2 1 
7 6 5 4 3 2 1 
7 6 5 4 3 2 1 
'''