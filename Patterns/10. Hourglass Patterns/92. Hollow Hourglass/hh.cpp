#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=2*n-1; i++){

        int row=min(i,2*n-i);

        for(int j=1; j<=2*n-1; j++){
            if(row==j || row==1 || row+j==2*n){
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

* * * * * * * * *
  *           *
    *       *
      *   *
        *
      *   *
    *       *
  *           *
* * * * * * * * *  

*/