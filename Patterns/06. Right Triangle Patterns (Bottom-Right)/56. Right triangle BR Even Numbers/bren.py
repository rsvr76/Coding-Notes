n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,i):
        print(' ', end = ' ')
    # print stars
    for j in range(1,n-i+2):
        print(2*j, end = " ")
    print()

'''

There's also another approach which i used first to print this pattern.
(j>=i) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output:

2 4 6 8 10 
  2 4 6 8 
    2 4 6 
      2 4 
        2 

'''