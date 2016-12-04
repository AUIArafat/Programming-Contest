#include<iostream>
using namespace std;
int main(){
    int N;
    cin>>N;
    int k = 0;
    for(int i=0;i<N;i++){
    k = N-1;
        for(int l = 0;l<k-i;l++){
            cout<<" ";
        }
        for(int j=0;j<i+1;++j){
            cout<<"#";
        }
        cout<<endl;
    }
}

