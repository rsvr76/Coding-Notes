#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        // print spaces
        for(int j=1; j<=n-i; j++){
            cout<<"   ";
        }
        // print first half
        for(int j=1; j<=i; j++){
            cout<<setw(3)<<2*j;
        }
        // print second half
        for(int j=i-1; j>=1; j--){
            cout<<setw(3)<<2*j;
        }
        cout<<'\n';
    }

}

/*
Output

              2
           2  4  2
        2  4  6  4  2
     2  4  6  8  6  4  2
  2  4  6  8 10  8  6  4  2

*/