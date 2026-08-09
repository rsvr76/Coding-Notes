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
            cout<<2*j-1<<" ";
        }
        cout<<'\n';
    }
}

/*
Output

1 3 5 7 9 11 13 
1 3 5 7 9 11 13 
1 3 5 7 9 11 13 
1 3 5 7 9 11 13 
1 3 5 7 9 11 13  

*/