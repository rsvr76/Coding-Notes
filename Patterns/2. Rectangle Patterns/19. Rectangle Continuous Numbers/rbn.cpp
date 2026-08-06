#include <iostream>
#include <iomanip>
using namespace std;
int main(){
    int l,b,num=1;
    cout<<"Enter the Length : ";
    cin>>l;
    cout<<"Enter the Breadth : ";
    cin>>b;

    for(int i=1; i<=l; i++){
        for(int j=1; j<=b; j++){
            if(i==1 or i==l or j==1 or j==b){
                cout<<setw(3)<<num;
            }else{
                cout<<"   ";
            }
            num++;
        }
        cout<<'\n';
    }
}

/*
Output

  1  2  3  4  5  6  7
  8                14
 15                21
 22                28
 29 30 31 32 33 34 35

*/