#include<iostream>
using namespace std;
int main(){
    int N;
    int result;
    cin>>N;
    if(N>0)
        result = N*(N+1)/2;
    else
        result = (-N*(N-1)/2) + 1;
    cout<<result<<endl;
}
