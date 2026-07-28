#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int n,num=1;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for (int j=1; j<=n; j++){
            if(i==1 || i==n || j==1 || j==n){
                cout<<setw(3)<<num;  // for output
            }else{
                cout<<"   ";
            }
            num++;
        }
        cout<< endl;
    }
}

/*
Output

  1  2  3  4  5
  6          10
 11          15
 16          20
 21 22 23 24 25

*/