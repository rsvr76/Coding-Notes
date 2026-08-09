n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,n-i+1):
        print(end='  ')
    # print first half
    for j in range(1,i+1):
        print(j,end=' ')
    # print second half
    for j in range(i-1,0,-1):
        print(j,end=' ')
    print()


'''

Output:

        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 

'''