#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    double R,A;
    double pie=3.14159;
    cin>>R;
    A=pie*R*R;
    cout.precision(4);
    cout<<"A="<<fixed<<A<<endl;
    return 0;
}
