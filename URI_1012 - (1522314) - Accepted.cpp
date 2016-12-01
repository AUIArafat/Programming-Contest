#include<iostream>
#include<iomanip>
#define pi 3.14159
using namespace std;
int main()
{
    float A,B,C;
    cin>>A;
    cin>>B;
    cin>>C;
    double TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;
    TRIANGULO = .5*A*C;
    CIRCULO = pi*C*C;
    TRAPEZIO = .5*(A+B)*C;
    QUADRADO = B*B;
    RETANGULO = A*B;
    cout.precision(3);
    cout<<"TRIANGULO:"<<" "<<fixed<<TRIANGULO<<endl;
    cout<<"CIRCULO:"<<" "<<fixed<<CIRCULO<<endl;
    cout<<"TRAPEZIO:"<<" "<<fixed<<TRAPEZIO<<endl;
    cout<<"QUADRADO:"<<" "<<fixed<<QUADRADO<<endl;
    cout<<"RETANGULO:"<<" "<<fixed<<RETANGULO<<endl;
    return 0;

}
