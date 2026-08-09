#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        // print spaces
        for(int j=1; j<=n-i; j++){
            cout<< "  ";
        }
        // print stars
        for(int j=1; j<=i; j++){
            if(i==n or j==1 or i==j){
                cout<<"* ";
            }else{
                cout<<"  ";
            }
        }
        cout << '\n';
    }
}

/* 

Use (i+j>=n+1) logic for less code & easier understanding.
I only used for loops to strengthen my knowledge in it. 

Output

        * 
      * * 
    *   * 
  *     * 
* * * * * 

*/ 