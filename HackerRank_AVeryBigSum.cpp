#include<iostream>
using namespace std;
int main(){
    int N;
    long long A, Sum = 0;
    cin>>N;
    while(N--){
        cin>>A;
        Sum = Sum + A;
    }
    cout<<Sum<<endl;
}
