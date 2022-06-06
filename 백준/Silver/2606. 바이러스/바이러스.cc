#include <iostream>
#include <vector>
#include <cstring>

#define MAX 1000

using namespace std;

vector <int> Virus[MAX];
bool visited[MAX];
int cnt = 0;

void dfs(int start)
{
    cnt++;
    visited[start] = true;
    for (int i = 0; i < Virus[start].size(); i++) {
        int next = Virus[start][i];
        if (!visited[next]) {
            dfs(next);
            
        }
    }
    
}


int main()
{
    int c, n, a, b;
    
    cin >> c >> n;
    
    for(int i = 1; i <= n; i++)
    {
        cin >> a >> b;
        Virus[a].push_back(b);
        Virus[b].push_back(a);
        
    }
    
    
    memset(visited, false, sizeof(visited));
    
    dfs(1);
    
    cout << cnt-1;
    
}
