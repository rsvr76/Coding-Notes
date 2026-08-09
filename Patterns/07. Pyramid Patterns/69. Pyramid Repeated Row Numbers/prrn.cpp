#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        // print spaces
        for(int j=1; j<=n-i; j++){
            cout<<"  ";
        }
        // print stars
        for(int j=1; j<=2*i-1; j++){
            cout<<i<<" ";
        }
        cout<<'\n';
    }
}

/*
Output

        1 
      2 2 2 
    3 3 3 3 3 
  4 4 4 4 4 4 4 
5 5 5 5 5 5 5 5 5  

Another Method (Matrix form) using if-else

    int p;
    cout<<"Enter a Number : ";
    cin>>p;

    for(int i=1; i<=p; i++){
        for(int j=1; j<=2*p-1; j++){
            if(j>=p-i+1 && j<=p+i-1){
                cout<<i<<" ";
            }else{
                cout<<"  ";
            }
        }
        cout<<'\n';
    }

*/

