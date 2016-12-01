#include<iostream>
using namespace std;
int main()
{
    int *arr,N;
    int Count=0;
    cin>>N;
    arr =new int[N];
    arr[0]=0;
    arr[1]=1;
    if(N>0 && N<46)
    {
        cout<<arr[0]<<" "<<arr[1]<<" ";
        for(int i=2;i<N;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
            cout<<arr[i];
            if(Count==N-3)
            break;
            cout<<" ";
            Count++;
        }
        cout<<endl;
    }

}
