/*
#include<iostream>
#include<sstream>
using namespace std;
*/

int main()  {
    string A;
    cin>>A;
    // YOUR CODE GOES HERE
    stringstream ss(A);
    char ch;
    int a[100];
    int i = 0;
    while (ss >> a[i]) {
        ss >> ch;
        cout << a[i] << endl;
        i++;
    }
    return 0;
}
