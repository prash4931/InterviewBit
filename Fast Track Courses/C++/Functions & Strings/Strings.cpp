/*
#include<iostream>
#include<string>
using namespace std;
*/

int main()  {
    string A, B;
    cin>>A>>B;
    // YOUR CODE GOES HERE
    cout << A.size() << " " << B.size() << endl;
    cout << A + B << endl;
    char temp = A[0];
    A[0] = B[0];
    B[0] = temp;
    cout << A << " " << B;

    return 0;
}
