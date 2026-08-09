n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,n-i+1):
        print(end='  ')
    # print stars
    for j in range(1,2*i):
        print(i,end=" ")
    print()

'''
Output:

        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 

Another Method (Matrix form) using if-else

p = int(input("Enter a Number : "))

for i in range(1,p+1):
    for j in range(1,2*p):
        if(p-i+1 <= j <= p+i-1):
            print(i,end=" ")
        else:
            print(end='  ')
    print()

'''