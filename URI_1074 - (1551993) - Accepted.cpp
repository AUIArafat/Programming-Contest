#include<iostream>
using namespace std;
int main()
{
    int N;
    cin>>N;
    int *A;
    A=new int[N];
    for(int i=0;i<N;i++)
    {
        cin>>A[i];
    }
    for(int i=0;i<N;i++)
    {
        if( A[i]%2!=0 && A[i]<0)
        {
            cout<<"ODD NEGATIVE"<<endl;
        }
        else if(A[i]%2!=0 && A[i]>0 )
        {
            cout<<"ODD POSITIVE"<<endl;
        }
        else if(A[i]==0)
        {
            cout<<"NULL"<<endl;
        }
        else if(A[i]%2==0 && A[i]>0)
        {
            cout<<"EVEN POSITIVE"<<endl;
        }
        else if( A[i]%2==0 && A[i]<0)
        {
            cout<<"EVEN NEGATIVE"<<endl;
        }
    }
    return 0;
}
