#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        // print spaces
        for(int j=1; j<=n-i; j++){
            cout<<"  ";
        }
        // print first half
        for(int j=1; j<=i; j++){
            cout<<2*j-1<<" ";
        }
        // print second half
        for(int j=i-1; j>=1; j--){
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

*/