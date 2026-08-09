#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=i; j<=n; j++){ // for(int j=1; j<=(n-i+1); j++) --> if(i==1 or j==1 or i+j==n+1)
            if(i==1 or j==i or j==n){ // write each iteration & you know why
                cout<< "* ";
            }else{
                cout<< "  ";
            }
        }
        cout<<'\n';
    }
}

/*
 

Output

* * * * * 
*     * 
*   * 
* * 
*   

*/