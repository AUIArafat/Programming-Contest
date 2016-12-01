#include<iostream>
#include<iomanip>
#define pi 3.14159
using namespace std;
int main()
{
    int R;
    cin>>R;
    double VOLUME;
    VOLUME = (4.0/3)*pi*R*R*R;
    cout.precision(3);
    cout<<"VOLUME"<<" = "<<fixed<<VOLUME<<endl;
    return 0;
}
