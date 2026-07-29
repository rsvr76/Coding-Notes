#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=n; i>=1; i--){
        for(int j=n; j>=1; j--){
            cout<<j<<' ';
        }
        cout<<'\n';
    }
}

/*
Output

5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 

*/