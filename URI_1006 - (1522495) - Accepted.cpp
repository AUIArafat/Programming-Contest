#include<iostream>
#include<iomanip>

using namespace std;
int main()
{
    float A,B,C;
    double P;
    cin>>A;
    cin>>B;
    cin>>C;
    P=(2*A+3*B+5*C)/10.0;
    cout.precision(1);
    cout<<"MEDIA"<<" = "<<fixed<<P<<endl;
    return 0;
}
