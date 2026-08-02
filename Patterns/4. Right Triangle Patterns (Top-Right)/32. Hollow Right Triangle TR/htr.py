n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,n-i+1):
        print(" ",end = " ")
    # print stars
    for j in range(1,i+1):
        if(i==n or j==1 or i==j):
            print("*", end = " ")
        else:
            print(' ', end = ' ')
    print()

'''
Use (i+j>=n+1) logic for less code & easier understanding.
I only used for loops to strengthen my knowledge in it. 

Output:

        * 
      * * 
    *   * 
  *     * 
* * * * * 
  
'''