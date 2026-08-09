#include <iostream>
using namespace std;
int main(){
    int l,b;
    cout<<"Enter the Length : ";
    cin>>l;
    cout<<"Enter the Breadth : ";
    cin>>b;

    for(int i=1; i<=l; i++){
        for(int j=b; j>=1; j--){ // we are printing j, so don't need to change the order of i
            cout<<j<<" ";
        }
        cout<<'\n';
    }
}

/*
Output

7 6 5 4 3 2 1
7 6 5 4 3 2 1
7 6 5 4 3 2 1
7 6 5 4 3 2 1
7 6 5 4 3 2 1 

*/