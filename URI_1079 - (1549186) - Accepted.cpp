#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    int N;
    float A,B,C,D;
    cin>>N;
    for(int i=0;i<N;i++)
    {

        cin>>A>>B>>C;
        D=(A*2+B*3+C*5)/(2+3+5);
        cout.precision(1);
        cout<<fixed<<D<<endl;
    }
    return 0;

}
