n = int(input("Enter a Number : "))

for i in range(1,2*n):

    row = min(i,2*n-i)
    
    # print spaces
    for j in range(1,row):
        print(end='  ')
    # print first half
    for j in range(1,n-row+2):
        print(2*j-1, end=' ')
    # print second half
    for j in range(n-row,0,-1):
        print(2*j-1, end=' ')
    print()


'''
Output:

1 3 5 7 9 7 5 3 1 
  1 3 5 7 5 3 1 
    1 3 5 3 1 
      1 3 1 
        1 
      1 3 1 
    1 3 5 3 1 
  1 3 5 7 5 3 1 
1 3 5 7 9 7 5 3 1  


'''