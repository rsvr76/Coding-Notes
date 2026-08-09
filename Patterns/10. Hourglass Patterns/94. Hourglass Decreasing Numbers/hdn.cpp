#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int n,row;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=2*n-1; i++){

        row = min(i,2*n-i);

        // print spaces
        for(int j=1; j<=row-1; j++){
            cout<<"  ";
        }
        // print first half
        for(int j=n; j>=row; j--){
            cout<<j<<" ";
        }
        // print second half
        for(int j=row+1; j<=n; j++){
            cout<<j<<" ";
        }
        cout<<'\n';

    }
}

/*
Output

5 4 3 2 1 2 3 4 5 
  5 4 3 2 3 4 5 
    5 4 3 4 5 
      5 4 5 
        5 
      5 4 5 
    5 4 3 4 5 
  5 4 3 2 3 4 5 
5 4 3 2 1 2 3 4 5  

*/