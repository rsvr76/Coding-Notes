#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        //print spaces
        for(int j=1; j<=n-i; j++){
            cout<< "  ";
        }
        //print stars
        for(int j=1; j<=i;j++){
            cout<<"* ";
        }
        cout << '\n';
    }
}

/* 

There's also another approach which i used first to print this pattern.
(i+j>=n+1) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output

        * 
      * * 
    * * * 
  * * * * 
* * * * * 

*/ 