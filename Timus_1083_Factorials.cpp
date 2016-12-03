#include<iostream>
#include<cstdio>
#include<string.h>
using namespace std;
int main(){
    int n, k;
    char S[30];
    long long result;
    cin>>n;
    result = 1;
    scanf("%s", &S);
    k = strlen(S);
    if(n%k == 0){
        int i=0;
        while((n-i*k)!=k){
           result = result * (n-i*k);
           ++i;
        }
        result = result * k;
    }
    else{
        int i=0;
        while((n-i*k)!=(n%k)){
            result = result *(n-i*k);
            i++;
        }
        result = result *(n%k);
    }
        cout<<result<<endl;
}
