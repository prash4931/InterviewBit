/*
#include <iostream>
using namespace std;
*/

// Your code goes here
template <class T>

T index_of_largest(T t[], int NO_OF_TERMS){
	T temp_max = t[0];
	T pos = 0;
	for (int i = 1; i < NO_OF_TERMS; i++)
	{
		if (temp_max < t[i] )
		{
			temp_max = t[i];
			pos = i;
		}
	}
	return pos;
}

/*
int main()  {
    int n;
    cin>>n;
    int arr_int[n];
    for(int i = 0; i < n; i++){
        cin>>arr_int[i];
    }
    int res = index_of_largest<int>(arr_int, n);
    cout<<res<<endl;
    
    cin>>n;
    double arr_double[n];
    for(int i = 0; i < n; i++){
        cin>>arr_double[i];
    }
    res = index_of_largest<double>(arr_double, n);
    cout<<res<<endl;
    return 0;
}
*/
