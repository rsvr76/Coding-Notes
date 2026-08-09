#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int n,row;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=2*n-1; i++){

        row = min(i,2*n-i);
        
        // print spaces
        for(int j=1; j<=row-1; j++){
            cout<<"  ";
        }
        // print stars
        for(int j=1; j<=2*(n-row+1)-1; j++){
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
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 

*/