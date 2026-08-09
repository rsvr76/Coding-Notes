n = int(input("Enter a Number : "))

for i in range(1,n+1):
    # print spaces
    for j in range(1,n-i+1):
        print(" ",end = " ")
    # print stars
    for j in range(1,i+1):
        print(j, end = " ")
    print()

'''

Output:

        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5 
  
'''