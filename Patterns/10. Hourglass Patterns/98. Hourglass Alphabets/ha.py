n = int(input("Enter a Number : "))

for i in range(1,2*n):

    row = min(i,2*n-i)
    
    # print spaces
    for j in range(1,row):
        print(end='  ')
    # print first half
    for j in range(1,n-row+2):
        print(chr(ord('A')+j-1), end=' ')
    # print second half
    for j in range(n-row,0,-1):
        print(chr(ord('A')+j-1), end=' ')
    print()


'''
Output:

A B C D E D C B A 
  A B C D C B A 
    A B C B A 
      A B A 
        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A   


'''