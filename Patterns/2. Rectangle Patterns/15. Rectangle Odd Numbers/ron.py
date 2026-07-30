l = int(input("Enter the Length : "))
b = int(input("Enter the Breadth : "))

for i in range(1,l+1):
    for j in range(1,b+1):
            print(2*j-1, end=' ')
    print()

'''
Output:

1 3 5 7 9 11 13 
1 3 5 7 9 11 13 
1 3 5 7 9 11 13 
1 3 5 7 9 11 13 
1 3 5 7 9 11 13    
'''