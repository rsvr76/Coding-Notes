#include <iostream>
#include <iomanip>
#include <algorithm>
using namespace std;
int main(){
    int n,row,num=1;
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
            cout<<setw(3)<<num;
            num++;
        }
        // print second half
        for(int j=n-row; j>=1; j--){
            cout<<setw(3)<<num;
            num++;
        }
        cout<<'\n';

    }
}

/*
Output

  1  2  3  4  5  6  7  8  9
    10 11 12 13 14 15 16
       17 18 19 20 21
          22 23 24
             25
          26 27 28
       29 30 31 32 33
    34 35 36 37 38 39 40
 41 42 43 44 45 46 47 48 49 

*/