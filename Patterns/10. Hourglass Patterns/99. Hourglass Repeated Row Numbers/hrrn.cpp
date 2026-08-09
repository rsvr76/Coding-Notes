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
        // print first half
        for(int j=1; j<=n-row+1; j++){
            cout<<row<<" ";
        }
        // print second half
        for(int j=n-row; j>=1; j--){
            cout<<row<<" ";
        }
        cout<<'\n';

    }
}

/*
Output

1 1 1 1 1 1 1 1 1 
  2 2 2 2 2 2 2 
    3 3 3 3 3 
      4 4 4 
        5 
      4 4 4 
    3 3 3 3 3 
  2 2 2 2 2 2 2 
1 1 1 1 1 1 1 1 1 

*/