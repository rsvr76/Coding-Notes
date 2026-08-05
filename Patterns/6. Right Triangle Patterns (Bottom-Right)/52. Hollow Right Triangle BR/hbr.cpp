#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
        if(i==1 or j==5 or i==j){
            cout<< "* ";
        }else{
            cout<< "  ";
        }
    }
    cout << '\n';
    }
}

/* 

There's also another approach which i used first to print this pattern.
(j>=i) using if-else condition, we can solve it by both approaches.
Since i solved mainly using if-else, this time i'll solve by for loops.

Output

* * * * * 
  *     * 
    *   * 
      * * 
        *

*/ 