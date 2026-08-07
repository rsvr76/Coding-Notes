n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,i):
        print(end='  ')
    # print first half
    for j in range(1,n-i+2):
        print(j%2,end=' ')
    # print second half
    for j in range(n-i,0,-1):
        print(j%2,end=' ')
    print()


'''

Output:

1 0 1 0 1 0 1 0 1 
  1 0 1 0 1 0 1 
    1 0 1 0 1 
      1 0 1 
        1  

'''