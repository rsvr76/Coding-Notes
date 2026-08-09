#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=i; j<=n; j++){ // for(int j=1; j<=(n-i+1); j++)
            cout<< 2*(j-i+1)-1 <<" "; // write each iteration & you know why
        }
        cout<<'\n';
    }
}

/*

Use (i+j<=n+1) for optimized code & for n matrix 

Output

1 3 5 7 9
1 3 5 7
1 3 5
1 3
1 

*/