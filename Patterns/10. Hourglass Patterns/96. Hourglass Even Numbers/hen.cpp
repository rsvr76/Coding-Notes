#include <iostream>
#include <iomanip>
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
            cout<<"   ";
        }
        // print first half
        for(int j=1; j<=n-row+1; j++){
            cout<<setw(3)<<2*j;
        }
        // print second half
        for(int j=n-row; j>=1; j--){
            cout<<setw(3)<<2*j;
        }
        cout<<'\n';

    }
}

/*
Output

  2  4  6  8 10  8  6  4  2
     2  4  6  8  6  4  2
        2  4  6  4  2
           2  4  2
              2
           2  4  2
        2  4  6  4  2
     2  4  6  8  6  4  2
  2  4  6  8 10  8  6  4  2

*/