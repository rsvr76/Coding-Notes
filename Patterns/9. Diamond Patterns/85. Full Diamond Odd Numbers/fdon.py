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
        print(2*j-1, end=' ')
    # print second half
    for j in range(row-1,0,-1):
        print(2*j-1, end=' ')
    print()

'''
Output:

        1 
      1 3 1 
    1 3 5 3 1 
  1 3 5 7 5 3 1 
1 3 5 7 9 7 5 3 1 
  1 3 5 7 5 3 1 
    1 3 5 3 1 
      1 3 1 
        1  
         
'''