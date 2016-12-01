#include<iostream>
#include<iomanip>

using namespace std;
int main()
{
    float A,B;
    double P;
    cin>>A;
    cin>>B;
    P=(3.5*A+7.5*B)/(3.5+7.5);
    cout.precision(5);
    cout<<"MEDIA"<<" = "<<fixed<<P<<endl;
    return 0;
}
