#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            cout<<2*j-1<<' ';
        }
        cout<<'\n';
    }
}

/*
Output

1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 
1 3 5 7 9 

*/