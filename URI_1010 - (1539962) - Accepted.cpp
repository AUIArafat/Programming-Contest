#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    int A,B,D,E;
    float C,F;
    float value;
    cin>>A>>B>>C;
    cin>>D>>E>>F;
    value=B*C+E*F;
    cout.precision(2);
    cout<<"VALOR A PAGAR"<<": "<<"R$ "<<fixed<<value<<endl;
}
