l = int(input("Enter the Length : "))
b = int(input("Enter the Breadth : "))

for i in range(1,l+1):
    for j in range(1,b+1):
        if(i==1 or i==l or j==1 or j==b):
            print("*", end=' ')
        else:
            print(end='  ')
    print()

'''
Output:

* * * * * * * 
*           * 
*           * 
*           * 
* * * * * * * 
'''