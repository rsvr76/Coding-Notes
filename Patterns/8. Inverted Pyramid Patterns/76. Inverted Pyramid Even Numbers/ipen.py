n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,i):
        print(end='  ')
    # print first half
    for j in range(1,n-i+2):
        print(2*j,end=' ')
    # print second half
    for j in range(n-i,0,-1):
        print(2*j,end=' ')
    print()


'''

Output:

1 3 5 7 9 7 5 3 1 
  1 3 5 7 5 3 1 
    1 3 5 3 1 
      1 3 1 
        1 

'''