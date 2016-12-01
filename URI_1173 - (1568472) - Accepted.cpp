#include<iostream>
using namespace std;
int main()
{
    int V;
    int Size=10;
    int *N=new int[Size];
    cin>>V;
    if(V<50)
    {
        for(int i=0;i<Size;i++)
        {
            N[i]=V;
            V=V*2;
        }
        for(int i=0;i<Size;i++)
        {
            cout<<"N"<<"["<<i<<"]"<<" = "<<N[i]<<endl;
        }

    }
    delete [] N;
    return 0;
}
