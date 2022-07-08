#include <iostream>
#include <stack>
#include <vector>

using namespace std;

int main()
{
    vector <int> S;
    vector <char> plu;
    stack <int> ch;
    stack <int> ans;

    int n, input;
    
    int cnt = 0;

    cin >> n;



    for(int i = 0; i < n; i++)
    {
        cin >> input;
        S.push_back(input);
    }

    for(int i = 0 ; i < n; i++)
    {
        if(ch.empty() != 1)
        {
                
                    while(ch.top() == S[cnt])
                    {
                        cnt++;
                        plu.push_back('-');
                        ans.push(ch.top());
                        ch.pop();
                        if(ch.empty() == 1) break;
                    }
                    
        }

        ch.push(i+1);
        plu.push_back('+');

    }

    while(ch.empty() == 0)
    {
        plu.push_back('-');
        ans.push(ch.top());
        ch.pop();
    }

    while(ans.top() == S.back())
    {
        if(ans.empty() == 0 && S.empty() == 0)
        {
            ans.pop();
            S.pop_back();
        }

        if(ans.empty() == 1 && S.empty() == 1)
        {
            for(int i = 0; i < plu.size(); i++)
            {
                cout << plu[i] << "\n";
            }

            return 0;

        }

    }

    cout << "NO";

    return 0;
}
