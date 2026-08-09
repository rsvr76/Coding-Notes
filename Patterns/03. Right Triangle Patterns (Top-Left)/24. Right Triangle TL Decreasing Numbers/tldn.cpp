#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){        // Also possible
        for (int j=n; j>n-i; j--){  // for(j=1;j<=i;j++)
                cout<<j<<" ";       //   cout<<n-j+1
        }
        cout << '\n';
    }
}

/* Output

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1  

*/ 