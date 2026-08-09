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
            cout<<2*j<<" ";
        }
        cout << '\n';
    }
}

/* 

Output

        2 
      2 4 
    2 4 6 
  2 4 6 8 
2 4 6 8 10  

*/ 