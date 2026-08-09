#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    // pyramid
    for(int i=1; i<=n; i++){
        // print spaces
        for(int j=1; j<=n-i; j++){
            cout<<"  ";
        }
        // print stars
        for(int j=1; j<=2*i-1; j++){
            cout<<"* ";
        }
        cout<<'\n';
    }

    // Inverted Pyramid
    for(int i=1; i<n; i++){
        // print spaces
        for(int j=1; j<=i; j++){
            cout<<"  ";
        }
        // print stars
        for(int j=1; j<=2*(n-i)-1; j++){
            cout<<"* ";
        }
        cout<<'\n';
    }
}

/*
Output

        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        *  

Another Method using if-else

    int row;

    for(int i=1; i<=2*n-1; i++){
        if(i<=n){
            row = i;
        }else{
            row = 2*n-i;
        }
        // print spaces
        for(int j=1; j<=n-row; j++){
            cout<<"  ";
        }
        // print stars
        for(int j=1; j<=2*row-1; j++){
            cout<<"* ";
        }
        cout<<'\n';

    }

*/