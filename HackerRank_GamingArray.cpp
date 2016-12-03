#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
long long maxValue(long long arr[], long long Size)
{// establish size of array
     int mx = arr[0];       // start with max = first element

     for(int i = 1; i<Size; i++)
     {
          if(arr[i] > mx)
                mx = arr[i];
     }
     return mx;                // return highest value in array
}

int main(){
    int g, n;
    long long A[100000], Size, value;
    cin>>g;
    while(g--){
        Size = 0;
        cin>>n;
        for(int i=0;i<n;i++){
            cin>>A[i];
            ++Size;
        }
        value = maxValue(A, Size);
        for(int i=n-1;i>=0;i++){
           if(value == A[i])
                --n;
        }
    }
}
