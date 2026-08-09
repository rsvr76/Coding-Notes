#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            cout<<2*j<<' ';
        }
        cout<<'\n';
    }
}

/*
Output

2 4 6 8 10 
2 4 6 8 10 
2 4 6 8 10 
2 4 6 8 10 
2 4 6 8 10  

*/