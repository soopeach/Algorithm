#include <iostream>

using namespace std;

int main()
{
    string check;
    string ans;
    
    
    while(1)
    {
        cin >> check;
        
        int n = check.length();
        
        if(check[0] == '0')
        {
            break;
        }
        for(int i = 0; i < n; i++)
        {
            if(check[i] == check[n-1-i])
            {
                ans = "yes";
            }
            
            else if(check[i] != check[n-1-i])
            {
                ans = "no";
                break;
            }
            
        }
        
        cout << ans << "\n";
        
    }
    

    return 0;
}
