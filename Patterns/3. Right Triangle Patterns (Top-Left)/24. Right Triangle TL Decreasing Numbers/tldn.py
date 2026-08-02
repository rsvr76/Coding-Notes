n = int(input("Enter a Number : "))

for i in range(1,n+1):         # Also Possible
    for j in range(n,n-i,-1):  # for(1,i+1)
        print(j, end = " ")    # print(n-j+1)
    print()

'''
Output:

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
    
'''