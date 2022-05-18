#include <iostream>

using namespace std;

int main()
{
    string input;
    int ans, check;
    
    cin >> input;
    int n = atoi(input.c_str());
    
    for(int i = 1; i <= n; i++)
    {
        check = i;
        string k = to_string(i);
        
        for(int j = 0; j < k.length(); j++)
        {
            
           check += k[j] - '0';
        }
        
        if(n == check)
        {
            ans = i;
            cout << ans;
            break;
        }
        
        
    }
    
    if(n != check) cout << "0";
    
    return 0;
}
