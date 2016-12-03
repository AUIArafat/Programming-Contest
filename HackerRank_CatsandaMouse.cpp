#include<iostream>
using namespace std;
int main(){
    int N, X, Y, Z;
    cin>>N;
    while(N--){
        cin>>X;
        cin>>Y;
        cin>>Z;
        if(abs(X-Z)>abs(Y-Z))
            cout<<"Cat B"<<endl;
        else if(abs(X-Z)<abs(Y-Z))
            cout<<"Cat A"<<endl;
        else
            cout<<"Mouse C"<<endl;
    }
}



