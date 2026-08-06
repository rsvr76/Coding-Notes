n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,n-i+1):
        print(end='  ')
    # print first half
    for j in range(1,i+1):
        print(j%2,end=' ')
    # print second half
    for j in range(i-1,0,-1):
        print(j%2,end=' ')
    print()


'''

Output:

        1 
      1 0 1 
    1 0 1 0 1 
  1 0 1 0 1 0 1 
1 0 1 0 1 0 1 0 1 

'''