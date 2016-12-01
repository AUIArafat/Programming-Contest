#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    float X;
    cin>>X;
    if(X>=0 && X<=400.00)
    {
        float Novo_salario=X+X*.15;
        float Reajuste_ganho=X*.15;
        cout.precision(2);

        cout<<"Novo salario: "<<fixed<<Novo_salario<<endl;
        cout<<"Reajuste ganho: "<<fixed<<Reajuste_ganho<<endl;
        cout<<"Em percentual: 15 %"<<endl;
    }
     else if(X>=400.01 && X<=800.00)
    {
        float Novo_salario=X+X*.12;
        float Reajuste_ganho=X*.12;
        cout.precision(2);

        cout<<"Novo salario: "<<fixed<<Novo_salario<<endl;
        cout<<"Reajuste ganho: "<<fixed<<Reajuste_ganho<<endl;
        cout<<"Em percentual: 12 %"<<endl;
    }
    else if(X>=800.01 && X<=1200.00)
    {
        float Novo_salario=X+X*.10;
        float Reajuste_ganho=X*.10;
        cout.precision(2);

        cout<<"Novo salario: "<<fixed<<Novo_salario<<endl;
        cout<<"Reajuste ganho: "<<fixed<<Reajuste_ganho<<endl;
        cout<<"Em percentual: 10 %"<<endl;
    }
     else if(X>=1200.01 && X<=2000.00)
    {
        float Novo_salario=X+X*.07;
        float Reajuste_ganho=X*.07;
        cout.precision(2);

        cout<<"Novo salario: "<<fixed<<Novo_salario<<endl;
        cout<<"Reajuste ganho: "<<fixed<<Reajuste_ganho<<endl;
        cout<<"Em percentual: 7 %"<<endl;
    }
     else if(X>2000.00)
    {
        
        float Novo_salario=X+X*.04;
        float Reajuste_ganho=X*.04;
        cout.precision(2);

        cout<<"Novo salario: "<<fixed<<Novo_salario<<endl;
        cout<<"Reajuste ganho: "<<fixed<<Reajuste_ganho<<endl;
        cout<<"Em percentual: 4 %"<<endl;
    }
    return 0;
}
