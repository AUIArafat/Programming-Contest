#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    float A,B,C,D,E,F,R1,R2;
    cin>>A>>B>>C;
    D = (B*B-4*A*C);
    E = (-B+sqrt(B*B-4*A*C));
    F = (-B-sqrt(B*B-4*A*C));
    if(D>=0 && E!=0 && F!=0)
    {
        R1=E/(2*A);
        cout.precision(5);
        cout<<"R1 = "<<fixed<<R1<<endl;
        R2=F/(2*A);
        cout.precision(5);
        cout<<"R2 = "<<fixed<<R2<<endl;
    }
    else if(D<0 || E==0 || F==0 )
    {
        cout<<"Impossivel calcular"<<endl;
    }
    return 0;
}
