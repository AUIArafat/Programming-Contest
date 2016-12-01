#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    double X;
    int Size=100;
    double *N=new double[Size];
    cin>>X;
        for(int i=0;i<Size;i++)
        {
            N[i]=X;
            X=X*.5;
        }
        for(int i=0;i<Size;i++)
        {
            cout.precision(4);
            cout<<"N"<<"["<<i<<"]"<<" = "<<fixed<<N[i]<<endl;
        }
    delete [] N;
    return 0;
}
