#include<iostream>
using namespace std;

int  main()
{
    int N;
    cin >> N;

    int hr,hr1;
    hr = N / 365;
    hr1 = N % 365;
    int h_min = hr1 / 30;
    int h_min1 = hr1 % 30;

    cout << hr << " ano(s)"<<endl;
    cout << h_min << " mes(es)"<<endl;
    cout << h_min1 <<" dia(s)"<<endl;

    return 0;
}
