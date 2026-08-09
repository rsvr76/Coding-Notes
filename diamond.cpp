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
        // print stars
        for(int j=1; j<=2*row-1; j++){
            cout<<"* ";
        }
        cout<<'\n';

    }

    
}
