n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,n-i+1):
        print(" ",end = " ")
    # print stars
    for j in range(1,i+1):
        print("*", end = " ")
    print()

'''

There's also another approach which i used first to print this pattern.
(i+j>=n+1) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output:

        * 
      * * 
    * * * 
  * * * * 
* * * * * 
  
'''