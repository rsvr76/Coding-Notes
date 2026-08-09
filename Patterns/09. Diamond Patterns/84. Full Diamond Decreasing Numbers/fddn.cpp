#include <iostream>
using namespace std;
int main(){
    int n,row;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=2*n-1; i++){
        if(i<=n){
            row = i;
        }else{
            row = 2*n-i;
        }
        // print spaces
        for(int j=1; j<=n-row; j++){
            cout<<"  ";
        }
        // print first half
        for(int j=n; j>=n-row+1; j--){
            cout<<j<<" ";
        }
        // print second half
        for(int j=n-row+2; j<=n; j++){
            cout<<j<<" ";
        }
        cout<<'\n';

    }
}

/*
Output

        5 
      5 4 5 
    5 4 3 4 5 
  5 4 3 2 3 4 5 
5 4 3 2 1 2 3 4 5 
  5 4 3 2 3 4 5 
    5 4 3 4 5 
      5 4 5 
        5 

*/