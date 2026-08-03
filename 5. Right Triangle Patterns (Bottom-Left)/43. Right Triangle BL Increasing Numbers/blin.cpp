#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=i; j<=n; j++){ // for(int j=1; j<=(n-i+1); j++)
            cout<<j-i+1<<" ";
        }
        cout<<'\n';
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1   

*/