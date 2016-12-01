#include<iostream>
using namespace std;
int main()
{
    int Size=10;
    int *A=new int[Size];
    for(int i=0;i<Size;i++)
    {
        cin>>A[i];
    }
    int *B= new int[Size];
    int j=0;
    for(int i=0;i<Size;i++)
    {
        if(A[i]<=0)
        {
            A[i]=1;
        }
        else
        {
            B[j]=A[i];
        }
    }
    for(int i=0;i<Size;i++)
    {
        cout<< "X"<<"["<<i<<"]"<<" = "<<A[i]<<endl;
    }
    delete [] A;
    delete [] B;
}
