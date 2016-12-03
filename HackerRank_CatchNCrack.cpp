#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;
int main(){
    int T, N, arr[1000+10], count = 0;
    int velSum, chanSum;
    cin>>T;
    while(T--){
        velSum = 0;
        chanSum = 0;
        ++count;
        cin>>N;
        for(int i=0;i<N;i++){
            cin>>arr[i];
        }
        sort(arr, arr+N);
        for(int i=0;i<N;i++){
            if(i+1==N) break;
            if(velSum<chanSum){
                velSum = velSum + arr[i];
            }
            else{
                chanSum = chanSum + arr[i];
            }
            --N;
        }

        if(chanSum>velSum)
            cout<<"Case "<<count<<": Chan"<<endl;
        else if(chanSum == velSum)
            cout<<"Case "<<count<<": Draw"<<endl;
        else
            cout<<"Case "<<count<<": Velmont"<<endl;
    }
}
