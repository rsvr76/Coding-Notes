#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int n,num=1;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=i; j<=n; j++){ // for(int j=1; j<=(n-i+1); j++)
            cout<<setw(3)<<num ; 
            num++;
        }
        cout<<'\n';
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

  1  2  3  4  5
  6  7  8  9
 10 11 12
 13 14
 15   

*/