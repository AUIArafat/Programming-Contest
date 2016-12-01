#include<iostream>
using namespace std;
int main()
{
    int N;
    int fact=1;

    cin>>N;
    if(0 < N < 13)
    {


        for(int i=N;i>=1;i--)
        {

            fact=fact*i;
        }
    cout<<fact<<endl;
    }
    return 0;
}
