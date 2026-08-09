n = int(input("Enter a Number : "))

for i in range(1,2*n):

    row = min(i,2*n-i)
    
    # print spaces
    for j in range(1,row):
        print(end='  ')
    # print first half
    for j in range(n,row-1,-1):
        print(j, end=' ')
    # print second half
    for j in range(row+1,n+1):
        print(j, end=' ')
    print()


'''
Output:

5 4 3 2 1 2 3 4 5 
  5 4 3 2 3 4 5 
    5 4 3 4 5 
      5 4 5 
        5 
      5 4 5 
    5 4 3 4 5 
  5 4 3 2 3 4 5 
5 4 3 2 1 2 3 4 5  


'''