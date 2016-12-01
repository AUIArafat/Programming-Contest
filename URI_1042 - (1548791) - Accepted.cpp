#include <iostream>

using namespace std;

int main()
{
    int top=-1;
    int SIZE =3;
    int *A;
    A=new int[SIZE];
    for(int i=0;i<SIZE;i++)
    {
        cin>>A[i];
    }
     int *B;
    B=new int [SIZE];
    for (int i=0;i<SIZE;i++){

            B[i]=A[i];
    }
    for (int i=0;i<SIZE-1;i++)
    {
        for (int i=0;i<SIZE-1;i++)
        {
            if (A[i]>A[i+1])
            {
                A[top]=A[i];
                A[i]=A[i+1];
                A[i+1]=A[top];
            }
        }
    }
    for(int i=0;i<SIZE;i++)
     {
         cout<<A[i]<<endl;
     }
    cout<<endl;
    for(int i=0;i<SIZE;i++)
     {
         cout<<B[i]<<endl;
     }
    return 0;
}

