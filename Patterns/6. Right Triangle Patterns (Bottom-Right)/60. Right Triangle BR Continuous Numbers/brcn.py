n = int(input("Enter a Number : "))
num=1

for i in range(1,n+1):
    # print spaces
    for j in range(1,i):
        print(end='   ')
    # print stars
    for j in range(1,n-i+2):
        print(f"{num:3}", end = "")
        num+=1
    print()

'''

There's also another approach which i used first to print this pattern.
(j>=i) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output:

  1  2  3  4  5
     6  7  8  9
       10 11 12
          13 14
             15

'''