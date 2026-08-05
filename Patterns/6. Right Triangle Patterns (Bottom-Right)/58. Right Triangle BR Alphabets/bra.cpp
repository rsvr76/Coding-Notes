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
        for(int j=1; j<=n-i+1; j++){
            cout<<char('A'+j-1)<<" ";
        }
        cout << '\n';
    }
}

/* 

There's also another approach which i used first to print this pattern.
(j>=i) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output

A B C D E 
  A B C D 
    A B C 
      A B 
        A 

*/ 