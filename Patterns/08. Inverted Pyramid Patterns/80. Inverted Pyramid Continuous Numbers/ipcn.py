n = int(input("Enter a Number : "))
num=1

for i in range(1,n+1):
    # print spaces
    for j in range(1,i):
        print(end='   ')
    # print first half
    for j in range(1,n-i+2):
        print(f"{num:3}",end='')
        num+=1
    # print second half
    for j in range(n-i,0,-1):
        print(f"{num:3}",end='')
        num+=1
    print()


'''

Output:

  1  2  3  4  5  6  7  8  9
    10 11 12 13 14 15 16
       17 18 19 20 21
          22 23 24
             25

'''