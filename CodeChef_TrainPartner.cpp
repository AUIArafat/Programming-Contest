#include<iostream>
using namespace std;
int main(){
    int T, N;
    cin>>T;
    while(T--){
        cin>>N;
        if(N>8){
            if(N%8==0){
                cout<<(N-1)<<"SL"<<endl;
            }
            else if(N%8==1){
                cout<<(N+3)<<"LB"<<endl;
            }
            else if(N%8==2){
                cout<<(3+N)<<"MB"<<endl;
            }
            else if(N%8==3){
                cout<<(N+3)<<"UB"<<endl;
            }
            else if(N%8==4){
                cout<<(N-3)<<"LB"<<endl;
            }
            else if(N%8==5){
                cout<<(N-3)<<"MB"<<endl;
            }
            else if(N%8==6){
                cout<<(N-3)<<"UB"<<endl;
            }
            else if(N%8==7){
                cout<<(N+1)<<"SU"<<endl;
            }
        }
        else{
            if(N%8==0){
                cout<<"7SL"<<endl;
            }
            else if(N%8==1){
                cout<<"4LB"<<endl;
            }
            else if(N%8==2){
                cout<<"5MB"<<endl;
            }
            else if(N%8==3){
                cout<<"6UB"<<endl;
            }
            else if(N%8==4){
                cout<<"1LB"<<endl;
            }
            else if(N%8==5){
                cout<<"2MB"<<endl;
            }
            else if(N%8==6){
                cout<<"3UB"<<endl;
            }
            else if(N%8==7){
                cout<<"8SU"<<endl;
            }

        }
    }
}
