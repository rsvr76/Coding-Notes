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
        for(int j=1; j<=i;j++){
            cout<<j<<" ";
        }
        cout << '\n';
    }
}

/* 

Output

        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5 

*/ 