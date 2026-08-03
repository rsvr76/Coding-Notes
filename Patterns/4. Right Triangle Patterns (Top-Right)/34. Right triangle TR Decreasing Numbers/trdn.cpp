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
        for(int j=n; j>=n-i+1; j--){
            cout<<j<<" ";
        }
        cout << '\n';
    }
}

/* 

Output

        5 
      5 4 
    5 4 3 
  5 4 3 2 
5 4 3 2 1  

*/ 