#include<iostream>
#include<iomanip>

using namespace std;
int main()
{
    int X;
    float Y;
    double T;
    cin>>X;
    cin>>Y;
    T=X/Y;
    cout.precision(3);
    cout<<fixed<<T<<" km/l"<<endl;
    return 0;
}
