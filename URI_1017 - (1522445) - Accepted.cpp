#include<iostream>
#include<iomanip>

using namespace std;
int main()
{
    int H,V;
    double P = 12;
    cin>>H;
    cin>>V;
    double L;
    L=(H*V)/P;
    cout.precision(3);
    cout<<fixed<<L<<endl;
    return 0;
}
