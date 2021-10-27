/*
#include<iostream>
using namespace std;
*/

void reverseArray(int arr[], int N){
    // Your code goes here
    for (int i = 0; i < N/2; i++) {
        arr[i] = arr[i] + arr[N-i-1];
        arr[N-i-1] = arr[i] - arr[N-i-1];
        arr[i] = arr[i] - arr[N-i-1];
    }
    
}


/*
int main()  {
    int N;
    cin>>N;
    int arr[N];
    for(int i = 0; i < N; i++){
        cin>>arr[i];
    }
    reverseArray(arr, N);
    for(int i = 0; i < N; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    return 0;
}
*/
