#include <iostream>
using namespace std;
int main(){
    int l,b;
    cout<<"Enter the Length : ";
    cin>>l;
    cout<<"Enter the Brreadth : ";
    cin>>b;

    for(int i=1; i<=l; i++){
        for(int j=1; j<=b; j++){
            cout << char('A'+j-1) << " ";
        }
        cout <<'\n';
    }
}

/*
Output

A B C D E F G 
A B C D E F G 
A B C D E F G 
A B C D E F G 
A B C D E F G  

*/