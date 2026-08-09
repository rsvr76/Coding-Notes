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
            cout<<2*j-1<<" ";
        }
        // print second half
        for(int j=row-1; j>=1; j--){
            cout<<2*j-1<<" ";
        }
        cout<<'\n';

    }
}

/*
Output

        1 
      1 3 1 
    1 3 5 3 1 
  1 3 5 7 5 3 1 
1 3 5 7 9 7 5 3 1 
  1 3 5 7 5 3 1 
    1 3 5 3 1 
      1 3 1 
        1

*/