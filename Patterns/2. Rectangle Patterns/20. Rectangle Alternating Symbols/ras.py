l = int(input("Enter the Length : "))
b = int(input("Enter the Breadth : "))

for i in range(1,l+1):
    for j in range(1,b+1):
        if(j%2!=0):
            print("*", end = ' ')
        else:
            print("#", end = ' ')
    print()

'''
Output:

* # * # * # * 
* # * # * # * 
* # * # * # * 
* # * # * # * 
* # * # * # * 
'''