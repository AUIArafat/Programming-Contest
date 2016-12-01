#include<iostream>
#include<iomanip>
#include<string>
using namespace std;
int main()
{
    string name;
    double salary,sold,total;
    cin>>name;
    cin>>salary;
    cin>>sold;
    total=salary+sold*.15;
    cout.precision(2);
    cout<<"TOTAL"<<" = "<<"R$ "<<fixed<<total<<endl;
    return 0;
}
