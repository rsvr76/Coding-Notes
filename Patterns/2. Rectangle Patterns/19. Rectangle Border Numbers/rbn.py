l = int(input("Enter the Length : "))
b = int(input("Enter the Breadth : "))
num=1

for i in range(1,l+1):
    for j in range(1,b+1):
        if(i==1 or i==l or j==1 or j==b):
            print(f"{num:3}", end='')
        else:
            print(end='   ')
        num+=1
    print()

'''
Output:

  1  2  3  4  5  6  7
  8                14
 15                21
 22                28
 29 30 31 32 33 34 35 
'''