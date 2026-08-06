n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,n-i+1):
        print(end='  ')
    # print first half
    for j in range(1,i+1):
        print(chr(ord('A')+j-1),end=' ')
    # print second half
    for j in range(i-1,0,-1):
        print(chr(ord('A')+j-1),end=' ')
    print()


'''

Output:

        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A 

'''