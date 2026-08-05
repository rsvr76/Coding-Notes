#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=i; j<=n; j++){ // for(int j=1; j<=(n-i+1); j++)
            cout<< 2*(j-i+1) << " "; // write each iteration & you know why
        }
        cout<<'\n';
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

2 4 6 8 10 
2 4 6 8 
2 4 6 
2 4 
2   

*/