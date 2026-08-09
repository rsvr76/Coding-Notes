#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int n,num=1;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        // print spaces
        for(int j=1; j<i; j++){
            cout<< "   ";
        }
        // print stars
        for(int j=1; j<=n-i+1; j++){
            cout<<setw(3)<<num;
            num++;
        }
        cout << '\n';
    }
}

/* 

There's also another approach which i used first to print this pattern.
(j>=i) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output

  1  2  3  4  5
     6  7  8  9
       10 11 12
          13 14
             15

*/ 