n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,i):
        print(end='  ')
    # print stars
    for j in range(1,2*(n-i+1)):
        print("*", end=' ')
    print()

'''
Output:

* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

Another Method using if-else:

p = int(input("Enter a Number : "))

for i in range(1,p+1):
    for j in range(1,2*p):
        if(i <= j <= 2*p-i):
            print("*",end=" ")
        else:
            print(end='  ')
    print()

'''