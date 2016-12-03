#include<iostream>
using namespace std;

bool isPrime(int N){
    for(int i=2;i<=N/2;i++){
        if(N%i==0)
           return false;
    }
    return true;
}

int main(){
    int N, M;
    cin>>N;
    cin>>M;
    int flag = 0;
    while(N<=M){
        ++N;
        if(isPrime(N) && N==M){
            flag = 1;
            break;
        }
        if(isPrime(N) && N!=M){
            flag = 0;
            break;
        }
        else
            flag = 0;
    }
    if(flag == 1)
        cout<<"YES"<<endl;
    else
        cout<<"NO"<<endl;
}
