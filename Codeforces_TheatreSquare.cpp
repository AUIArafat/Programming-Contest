#include<iostream>
#include<cmath>
using namespace std;

int main(){
    long long n, m, a;
    long long result;
    cin>>n;
    cin>>m;
    cin>>a;
    result = ceil(n/(double)a)*ceil(m/(double)a);
    cout<<result<<endl;
}
