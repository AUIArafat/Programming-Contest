#include <iostream>

using namespace std;

int main()
{
   int startTime;
   int endTime;
   cin>>startTime;
   cin>>endTime;
   int X;
   if(startTime<endTime)
        X = endTime - startTime;
   else
    X = 24 - startTime + endTime;
   cout<<"O JOGO DUROU "<<X<<" HORA(S)"<<endl;
}
