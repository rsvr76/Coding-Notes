n = int(input("Enter a Number : "))
row=1

for i in range(1,2*n):
    if(i<=n):
        row=i
    else:
        row=2*n-i
    
    # print spaces
    for j in range(1,n-row+1):
        print(end='  ')
    # print first half
    for j in range(1,row+1):
        print(j, end=' ')
    # print second half
    for j in range(row-1,0,-1):
        print(j, end=' ')
    print()

'''
Output:

        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
  1 2 3 4 3 2 1 
    1 2 3 2 1 
      1 2 1 
        1 
         
'''