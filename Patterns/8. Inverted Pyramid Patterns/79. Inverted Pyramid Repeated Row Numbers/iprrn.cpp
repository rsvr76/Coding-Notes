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
            cout<<i<<" ";
        }
        // print second half
        for(int j=n-i; j>=1; j--){
            cout<<i<<" ";
        }
        cout<<'\n';
    }

}

/*
Output

1 1 1 1 1 1 1 1 1 
  2 2 2 2 2 2 2 
    3 3 3 3 3 
      4 4 4 
        5   

*/