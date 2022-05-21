#include <iostream>
#include <algorithm>

using namespace std;

int binary_search(int x[], int key, int size)
{
    int low, high, mid;
    low = 0;
    high = size-1;
    
    while(high >= low)
    {
        mid = (low+high)/2;
        
        if(x[mid] == key) return 1;
        else if(x[mid] > key) high = mid -1;
        else if(x[mid] < key) low = mid +1;
    }
    
   return 0;
    
}

int main()
{
   int n, m, input, ans;
   
   cin >> n;
   int A[n];
   
   for(int i = 0; i < n; i++)
   {
       cin >> input;
       A[i] = input;
   }
   
   sort(A, A+n);
   
   cin >> m;
   
   int B[m];
   
   for(int i = 0; i < m; i++)
   {
       cin >> input;
       B[i] = input;
   }
   
   for(int i = 0; i < m; i++ )
  { 
   ans = binary_search(A, B[i], n);
   
   cout << ans << "\n";
      
  }
    return 0;
}

