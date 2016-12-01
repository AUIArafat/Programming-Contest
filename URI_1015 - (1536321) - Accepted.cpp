#include<iostream>
#include<cmath>
#include<iomanip>
using namespace std;
int main()
{
    int x1,y1,x2,y2;
    cin>>x1>>y1;
    cin>>x2>>y2;
    double distance;
    distance=sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

    cout.precision(4);
    cout<<fixed<<distance<<endl;
    return 0;
}
