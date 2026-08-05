#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=i; j<=n; j++){ // for(int j=1; j<=(n-i+1); j++)
            cout<< char('A'+j-i) << " "; // write each iteration & you know why
        }
        cout<<'\n';
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

A B C D E 
A B C D 
A B C 
A B 
A  

*/