#include<iostream>
using namespace std;
int main()
{
    int X,Y;

    while(1)
    {
        cin>>X>>Y;
        if(X!=Y)
        {
            if(X>Y)
            {
                cout<<"Decrescente"<<endl;
            }
            else if(Y>X)
            {
                cout<<"Crescente"<<endl;
            }
        }
        else break;
    }
    return 0;
}

