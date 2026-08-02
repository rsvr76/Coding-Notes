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
        for(int j=i; j>0;j--){
            cout<<j<<" ";
        }
        cout << '\n';
    }
}

/* 

Output

        1 
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1 

*/ 