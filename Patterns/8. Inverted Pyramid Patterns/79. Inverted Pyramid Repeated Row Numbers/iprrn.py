n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,i):
        print(end='  ')
    # print first half
    for j in range(1,n-i+2):
        print(i,end=' ')
    # print second half
    for j in range(n-i,0,-1):
        print(i,end=' ')
    print()


'''

Output:

1 1 1 1 1 1 1 1 1 
  2 2 2 2 2 2 2 
    3 3 3 3 3 
      4 4 4 
        5  

'''