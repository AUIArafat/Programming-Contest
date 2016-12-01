#include<iostream>
using namespace std;
int main()
{
    int X,Y;
    cin>>X>>Y;
    if (X==1)
    {
        double M1=Y*4.00;
        cout.precision(2);
        cout<<"Total: R$ "<<fixed<<M1<<endl;
    }
     else if (X==2)
    {
        double M2=Y*4.50;
        cout.precision(2);
        cout<<"Total: R$ "<<fixed<<M2<<endl;
    }
     else if (X==3)
    {
        double M3=Y*5.00;
        cout.precision(2);
        cout<<"Total: R$ "<<fixed<<M3<<endl;
    }
     else if (X==4)
    {
        double M4=Y*2.00;
        cout.precision(2);
        cout<<"Total: R$ "<<fixed<<M4<<endl;
    }
     else if (X==5)
    {
        double M5=Y*1.50;
        cout.precision(2);
        cout<<"Total: R$ "<<fixed<<M5<<endl;
    }
    return 0;
}
