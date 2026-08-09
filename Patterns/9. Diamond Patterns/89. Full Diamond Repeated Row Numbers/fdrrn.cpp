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
        for(int j=1; j<=row; j++){
            cout<<i<<" ";
        }
        // print second half
        for(int j=row-1; j>=1; j--){
            cout<<i<<" ";
        }
        cout<<'\n';

    }
}

/*
Output

        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5 
  6 6 6 6 6 6 6 
    7 7 7 7 7 
      8 8 8 
        9 

*/