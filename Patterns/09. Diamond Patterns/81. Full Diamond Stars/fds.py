n = int(input("Enter a Number : "))

# pyramid
for i in range(1,n+1):
    # print spaces
    for j in range(1,n-i+1):
        print(end='  ')
    # print stars
    for j in range(1,2*i):
        print("*",end=" ")
    print()

#inverted pyramid
for i in range(1,n+1):
    # print spaces
    for j in range(1,i+1):
        print(end='  ')
    # print stars
    for j in range(1,2*(n-i)):
        print("*",end=" ")
    print()


'''
Output:

        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

        
Another Method using if-else

row=1

for i in range(1,2*n):
    if(i<=n):
        row=i
    else:
        row=2*n-i
    
    # print spaces
    for j in range(1,n-row+1):
        print(end='  ')
    # print stars
    for j in range(1,2*row):
        print("*", end=' ')
    print()

'''