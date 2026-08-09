n = int(input("Enter a Number : "))

for i in range(1,2*n):
    
    row = min(i,2*n-i)
    
    # print spaces
    for j in range(1,row):
        print(end='  ')
    # print stars
    for j in range(1,2*(n-row+1)):
        print("*", end=' ')
    print()


'''
Output:

* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 


'''