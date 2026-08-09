#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int n,row,num=1;
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
            cout<<"   ";
        }
        // print first half
        for(int j=1; j<=row; j++){
            cout<<setw(3)<<num;
            num++;
        }
        // print second half
        for(int j=row-1; j>=1; j--){
            cout<<setw(3)<<num;
            num++;
        }
        cout<<'\n';

    }
}

/*
Output

              1
           2  3  4
        5  6  7  8  9
    10 11 12 13 14 15 16
 17 18 19 20 21 22 23 24 25
    26 27 28 29 30 31 32
       33 34 35 36 37
          38 39 40
             41

*/