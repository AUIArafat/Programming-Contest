#include<iostream>
#include<cstdio>
using namespace std;

int main(){
    int n, p;
    double value = 0;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>p;
        value = value + p;
    }
    value/=n;
    printf("%.12lf", value);
}
