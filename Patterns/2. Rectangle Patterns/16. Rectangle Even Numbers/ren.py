l = int(input("Enter the Length : "))
b = int(input("Enter the Breadth : "))

for i in range(1,l+1):
    for j in range(1,b+1):
            print(2*j, end=' ')
    print()

'''
Output:

2 4 6 8 10 12 14 
2 4 6 8 10 12 14 
2 4 6 8 10 12 14 
2 4 6 8 10 12 14 
2 4 6 8 10 12 14   
'''