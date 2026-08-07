n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,i):
        print(end='  ')
    # print first half
    for j in range(1,n-i+2):
        print(chr(ord('A')+j-1),end=' ')
    # print second half
    for j in range(n-i,0,-1):
        print(chr(ord('A')+j-1),end=' ')
    print()


'''

Output:

A B C D E D C B A 
  A B C D C B A 
    A B C B A 
      A B A 
        A  

'''