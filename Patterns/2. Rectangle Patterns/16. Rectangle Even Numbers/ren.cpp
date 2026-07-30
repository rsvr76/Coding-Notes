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
            cout<<2*j<<" ";
        }
        cout<<'\n';
    }
}

/*
Output

2 4 6 8 10 12 14 
2 4 6 8 10 12 14 
2 4 6 8 10 12 14 
2 4 6 8 10 12 14 
2 4 6 8 10 12 14 

*/