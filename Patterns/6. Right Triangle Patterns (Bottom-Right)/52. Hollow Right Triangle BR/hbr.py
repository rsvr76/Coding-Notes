n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(1,n+1):
        if(i==1 or j==n or i==j):
            print("*", end = " ")
        else:
            print(end = '  ')
    print()

'''

There's also another approach which i used first to print this pattern.
(j>=i) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output:

* * * * * 
  *     * 
    *   * 
      * * 
        *  

'''