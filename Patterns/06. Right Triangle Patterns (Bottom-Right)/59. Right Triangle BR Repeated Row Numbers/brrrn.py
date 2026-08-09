n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,i):
        print(' ', end = ' ')
    # print stars
    for j in range(1,n-i+2):
        print(i, end = " ")
    print()

'''

There's also another approach which i used first to print this pattern.
(j>=i) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output:

1 1 1 1 1 
  2 2 2 2 
    3 3 3 
      4 4 
        5

'''