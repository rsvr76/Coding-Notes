#include <iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter a Number : ";
    cin>>n;

    for(int i=1; i<=n; i++){
        for (int j=1; j<=n; j++){
            if(j%2!=0){
                cout<< "* ";
            }else{
                cout<<j<<" ";
            }
        }
        cout<< endl;
    }
}

/*
Output

* 2 * 4 * 
* 2 * 4 * 
* 2 * 4 * 
* 2 * 4 * 
* 2 * 4 *  

*/