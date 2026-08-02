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
            cout<<char('A'+j-1)<<" ";
        }
        cout << '\n';
    }
}

/* 

Output

        A 
      A B 
    A B C 
  A B C D 
A B C D E   

*/ 