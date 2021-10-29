#include<iostream>
#include <vector>
#include<algorithm>
using namespace std;

int main()  {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // E.g. 'cin' for input & 'cout' for output
    int n;
    cin >> n;
    vector<int> V(n);
    // int x = 0;
    for (int i = 0; i < n; i++) {
        cin >> V[i];
    }
    int pos = 0;
    cin >> pos;
    V.erase(V.begin()+pos);
    
    sort(V.begin(), V.end());
    for (int i = 0; i < n-1; i++) {
        cout << V[i] << endl;
    }
    return 0;
}
