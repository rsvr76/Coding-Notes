#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        // print spaces
        for(int j=1; j<i; j++){
            cout<< "  ";
        }
        // print stars
        for(int j=n; j>=i; j--){
            cout<<j<<" ";
        }
        cout << '\n';
    }
}

/* 

There's also another approach which i used first to print this pattern.
(j>=i) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output

5 4 3 2 1
  5 4 3 2
    5 4 3
      5 4
        5 

*/ 