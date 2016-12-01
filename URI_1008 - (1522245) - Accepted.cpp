 #include<iostream>
 #include<iomanip>
 using namespace std;
 int main()
 {
     int number;
     int hours;
     float thours;
     float SALARY;
     cin>>number;
     cin>>hours;
     cin>>thours;
     SALARY = hours * thours;
     cout<<"NUMBER"<<" = "<<number<<endl;
     cout.precision(2);
     cout<<"SALARY"<<" = "<<"U$ "<<fixed<<SALARY<<endl;
     return 0;

 }
