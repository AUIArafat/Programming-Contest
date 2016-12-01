#include <iostream>
#include<cstdlib>
using namespace std;

bool perfect(int) ;
int main()
{
    int N;
    cin>>N;
    int *X=new int[N];
    if(N>=1 && N<=100)
    {
        for (int i=0;i<N;i++)
    {
        cin>>X[i];
    }
	for(int i=0;i<N;i++)
    {
        if(X[i]>=1 && X[i]<=100000000)
	{
	    if (perfect(X[i]))
            cout<<X[i]<<" eh perfeito"<<endl;
        else
            cout<<X[i]<<" nao eh perfeito"<<endl;
	}
    }
    }
    delete [] X;
}
bool perfect (int n)
{
	int sum=0;
	for (int i = 1; i <= n/2; i++ )
    {
		n % i ==0 ? sum+= i  :sum +=0;
    }
    return !(sum - n);

}