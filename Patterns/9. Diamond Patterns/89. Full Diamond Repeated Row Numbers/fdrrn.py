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
        print(i, end=' ')
    # print second half
    for j in range(row-1,0,-1):
        print(i, end=' ')
    print()

'''
Output:

        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 
  6 6 6 6 6 6 6 
    7 7 7 7 7 
      8 8 8 
        9
         
'''