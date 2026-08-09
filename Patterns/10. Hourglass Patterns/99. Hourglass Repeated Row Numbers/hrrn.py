n = int(input("Enter a Number : "))

for i in range(1,2*n):

    row = min(i,2*n-i)
    
    # print spaces
    for j in range(1,row):
        print(end='  ')
    # print first half
    for j in range(1,n-row+2):
        print(row, end=' ')
    # print second half
    for j in range(n-row,0,-1):
        print(row, end=' ')
    print()


'''
Output:

1 1 1 1 1 1 1 1 1 
  2 2 2 2 2 2 2 
    3 3 3 3 3 
      4 4 4 
        5 
      4 4 4 
    3 3 3 3 3 
  2 2 2 2 2 2 2 
1 1 1 1 1 1 1 1 1 


'''