n = int(input("Enter a Number : "))

for i in range(1,2*n):

    row = min(i,2*n-i)
    
    # print spaces
    for j in range(1,row):
        print(end='   ')
    # print first half
    for j in range(1,n-row+2):
        print(f"{2*j:3}", end='')
    # print second half
    for j in range(n-row,0,-1):
        print(f"{2*j:3}", end='')
    print()


'''
Output:

  2  4  6  8 10  8  6  4  2
     2  4  6  8  6  4  2
        2  4  6  4  2
           2  4  2
              2
           2  4  2
        2  4  6  4  2
     2  4  6  8  6  4  2
  2  4  6  8 10  8  6  4  2  


'''