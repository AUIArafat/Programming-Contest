#include<iostream>
#define X 60
#define Y 90
using namespace std;

int  main()
{
    int D,Dif,T;
    cin>>D;
    Dif=Y-X;
    T=D*60/Dif;
    cout<<T<<" minutos" <<endl;
    return 0;
}
