#include<iostream>
using namespace std;
int main()
{
    int Size=20;
    int *B=new int[Size];
    for(int i=0;i<Size;i++)
    {
        cin>>B[i];
    }
    int *N=new int[Size];
    int j=0;
    for(int i=Size-1;i>=0;i--)
    {
        N[j]=B[i];
        j++;
    }
    for(int i=0;i<Size;i++)
    {
        cout<<"N"<<"["<<i<<"]"<<" = "<<N[i]<<endl;
    }
    delete [] N;
    delete [] B;
}
