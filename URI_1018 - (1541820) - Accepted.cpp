#include<iostream>
using namespace std;

int  main()
{
    int N;
    cin >> N;
    if(N>0 && N<1000000)
    {
        cout<<N<<endl;
        int hr100 = N / 100;
        int hr1 = N % 100;
        int h_min50 = hr1 / 50;
        int h_min2 = hr1 % 50;
        int h_min20 = h_min2 / 20;
        int h_min3 = h_min2 % 20;
        int h_min10 = h_min3 / 10;
        int h_min4 = h_min3 % 10;
        int h_min05 = h_min4 / 5;
        int h_min5 = h_min4 % 5;
        int h_min02 = h_min5 / 2;
        int h_min6 = h_min5 % 2;
        int h_min01 = h_min6 / 1;

        cout <<hr100   <<" nota(s) de R$ "<< "100,00"<<endl;
        cout <<h_min50 <<" nota(s) de R$ "<< "50,00" <<endl;
        cout <<h_min20 <<" nota(s) de R$ "<< "20,00" <<endl;
        cout <<h_min10 <<" nota(s) de R$ "<< "10,00" <<endl;
        cout <<h_min05 <<" nota(s) de R$ "<< "5,00"  <<endl;
        cout <<h_min02 <<" nota(s) de R$ "<< "2,00"  <<endl;
        cout <<h_min01 <<" nota(s) de R$ "<< "1,00"  <<endl;
    }


    return 0;
}
