#include<iostream>
using namespace std;

int  main()
{
	int N;
	cin >> N;

	int hr,hr1;
	hr = N / 3600;
	hr1 = N % 3600;
	int h_min = hr1 / 60;
	int h_min1 = hr1 % 60;

	cout << hr << ":" << h_min << ":" << h_min1 << endl;
	
	return 0;
}