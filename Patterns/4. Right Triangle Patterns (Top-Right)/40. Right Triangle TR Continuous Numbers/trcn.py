n = int(input("Enter a Number : "))
num=1
for i in range(1,n+1):
    # print spaces
    for j in range(1,n-i+1):
        print(" ",end = "  ")
    # print stars
    for j in range(1,i+1):
        print(f"{num:3}",end = '')
        num+=1
    print()

'''

Output:

              1
           2  3
        4  5  6
     7  8  9 10
 11 12 13 14 15  
  
'''