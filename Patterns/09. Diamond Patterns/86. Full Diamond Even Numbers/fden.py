n = int(input("Enter a Number : "))
row=1

for i in range(1,2*n):
    if(i<=n):
        row=i
    else:
        row=2*n-i
    
    # print spaces
    for j in range(1,n-row+1):
        print(end='   ')
    # print first half
    for j in range(1,row+1):
        print(f"{2*j:3}", end='')
    # print second half
    for j in range(row-1,0,-1):
        print(f"{2*j:3}", end='')
    print()

'''
Output:

              2
           2  4  2
        2  4  6  4  2
     2  4  6  8  6  4  2
  2  4  6  8 10  8  6  4  2
     2  4  6  8  6  4  2
        2  4  6  4  2
           2  4  2
              2
         
'''