n = int(input("Enter a Number : "))
num=1

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
        print(f"{num:3}", end='')
        num+=1
    # print second half
    for j in range(row-1,0,-1):
        print(f"{num:3}", end='')
        num+=1
    print()

'''
Output:

              1
           2  3  4
        5  6  7  8  9
    10 11 12 13 14 15 16
 17 18 19 20 21 22 23 24 25
    26 27 28 29 30 31 32
       33 34 35 36 37
          38 39 40
             41
         
'''