#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        // print spaces
        for(int j=1; j<=i-1; j++){
            cout<<"  ";
        }
        // print first half
        for(int j=1; j<=n-i+1; j++){
            cout<<char('A'+j-1)<<" ";
        }
        // print second half
        for(int j=n-i; j>=1; j--){
            cout<<char('A'+j-1)<<" ";
        }
        cout<<'\n';
    }

}

/*
Output

A B C D E D C B A 
  A B C D C B A 
    A B C B A 
      A B A 
        A   

*/