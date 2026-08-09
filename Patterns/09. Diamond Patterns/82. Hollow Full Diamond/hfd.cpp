#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=2*n-1; i++){
        for(int j=1; j<=2*n-1; j++){
            if(i+j==n+1 || j-i==n-1 || i-j==n-1 || i+j==3*n-1){
                cout<<"* ";
            }else{
                cout<<"  ";
            }
        }
        cout<<'\n';
    }
}

/*
Output

        *         
      *   *       
    *       *     
  *           *   
*               * 
  *           *   
    *       *     
      *   *       
        * 

Another approach using an extra vaiable row

    for(int i=1; i<=2*n-1; i++){

        int row = min(i,2*n-i);

        for(int j=1; j<=2*n-1; j++){
            if(row+j==n+1 || j-row==n-1){
                cout<<"* ";
            }else{
                cout<<"  ";
            }
        }
        cout<<'\n';
    }

*/