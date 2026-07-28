n = int(input("Enter a Number : "))

for i in range(1,n+1):
    for j in range(1,n+1):
        if (j%2!=0):
            print("*", end = " ")
        else:
            print(j, end = " ")
    print()
        
'''
Output:

* 2 * 4 * 
* 2 * 4 * 
* 2 * 4 * 
* 2 * 4 * 
* 2 * 4 *  
'''