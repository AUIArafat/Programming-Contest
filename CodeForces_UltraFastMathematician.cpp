#include<iostream>
#include<cstdio>
using namespace std;
int main(){
    char A[200];
    char B[200];
    scanf("%s", &A);
    scanf("%s", &B);
    int i=0;
    while(A[i]!='\0'){
        if(A[i]==B[i])
            cout<<"0";
        else
            cout<<"1";
        ++i;
    }
}
