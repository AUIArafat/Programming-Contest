#include<iostream>
using namespace std;
int main()
{
    int password=2002;
    while(1)
    {
        cin>>password;
    if(password==2002)
    {
        cout<<"Acesso Permitido"<<endl;
        break;
    }
    else
    {
        cout<<"Senha Invalida"<<endl;
    }
    }

    return 0;
}
