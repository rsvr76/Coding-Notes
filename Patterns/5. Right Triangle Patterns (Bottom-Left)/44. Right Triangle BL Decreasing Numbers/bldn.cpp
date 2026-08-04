#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=n; j>=i; j--){ 
            cout<<j<<" ";
        }
        cout<<'\n';
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

*/