#include <iostream>
using namespace std;
int main(){
    int l,b;
    cout<<"Enter the Length : ";
    cin>>l;
    cout<<"Enter the Breadth : ";
    cin>>b;

    for(int i=1; i<=l; i++){
        for(int j=1; j<=b; j++){
            cout<<j%2<<" ";
        }
        cout<<'\n';
    }
}

/*
Output

1 0 1 0 1 0 1 
1 0 1 0 1 0 1 
1 0 1 0 1 0 1 
1 0 1 0 1 0 1 
1 0 1 0 1 0 1 

*/