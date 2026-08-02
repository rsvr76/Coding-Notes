n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(1,i+1):
        print(2*j, end = " ")
    print()

'''
Output:

2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10    
'''