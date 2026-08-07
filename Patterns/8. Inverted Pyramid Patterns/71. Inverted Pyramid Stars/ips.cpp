#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        // print spaces
        for(int j=1; j<=i-1; j++){
            cout<<"  ";
        } 
        // print stars
        for(int j=1; j<=2*(n-i+1)-1; j++){
            cout<<"* ";
        }
        cout<<'\n';
    }
}

/*
Output

* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 

Another Method (Matrix form) using if-else

    int p;
    cout<<"Enter a Number : ";
    cin>>p;

    for(int i=1; i<=p; i++){
        for(int j=1; j<=2*p-1; j++){
            if(j>=i && j<=2*n-1){
                cout<<"* ";
            }else{
                cout<<"  ";
            }
        }
        cout<<'\n';
    }

*/