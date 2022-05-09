#include <iostream>
#include <string>
using namespace std;

int main()
{
    string s;
    int ans[26];
    int maxVal = 0;
    char realans = '?';
    
    for (int i =0; i < 26; i++)
    {
            ans[i] = 0;
    }
    
    cin >> s;
    
    
    for (int i = 0; i < s.length(); i++ )
    {
    
        if(s[i] == 'a' || s[i] == 'A')
            ans[0]++;
        else if(s[i] == 'b' || s[i] == 'B')
            ans[1]++;
        else if(s[i] == 'c' || s[i] == 'C')
            ans[2]++;
        else if(s[i] == 'd' || s[i] == 'D')
            ans[3]++;
        else if(s[i] == 'e' || s[i] == 'E')
            ans[4]++;
        else if(s[i] == 'f' || s[i] == 'F')
            ans[5]++;
        else if(s[i] == 'g' || s[i] == 'G')
            ans[6]++;
        else if(s[i] == 'h' || s[i] == 'H')
            ans[7]++;
        else if(s[i] == 'i' || s[i] == 'I')
            ans[8]++;
        else if(s[i] == 'j' || s[i] == 'J')
            ans[9]++;
        else if(s[i] == 'k' || s[i] == 'K')
            ans[10]++;
        else if(s[i] == 'l' || s[i] == 'L')
            ans[11]++;
        else if(s[i] == 'm' || s[i] == 'M')
            ans[12]++;
        else if(s[i] == 'n' || s[i] == 'N')
            ans[13]++;
        else if(s[i] == 'o' || s[i] == 'O')
            ans[14]++;
        else if(s[i] == 'p' || s[i] == 'P')
            ans[15]++;
        else if(s[i] == 'q' || s[i] == 'Q')
            ans[16]++;
        else if(s[i] == 'r' || s[i] == 'R')
            ans[17]++;
        else if(s[i] == 's' || s[i] == 'S')
            ans[18]++;
        else if(s[i] == 't' || s[i] == 'T')
            ans[19]++;
        else if(s[i] == 'u' || s[i] == 'U')
            ans[20]++;
        else if(s[i] == 'v' || s[i] == 'V')
            ans[21]++;
        else if(s[i] == 'w' || s[i] == 'W')
            ans[22]++;
        else if(s[i] == 'x' || s[i] == 'X')
            ans[23]++;
        else if(s[i] == 'y' || s[i] == 'Y')
            ans[24]++;
        else if(s[i] == 'z' || s[i] == 'Z')
            ans[25]++;
    }
    
    for (int i = 0; i < 26; i++)
    {
        if (maxVal < ans[i])
        {
            maxVal = ans[i];
            
            if(i == 0)
            {
                realans = 'A';
            }
            else if(i == 1)
            {
                realans = 'B';
            }
            else if(i == 2)
            {
                realans = 'C';
            }
            else if(i == 3)
            {
                realans = 'D';
            }
            else if(i == 4)
            {
                realans = 'E';
            }
            else if(i == 5)
            {
                realans = 'F';
            }
            else if(i == 6)
            {
                realans = 'G';
            }
            else if(i == 7)
            {
                realans = 'H';
            }
            else if(i == 8)
            {
                realans = 'I';
            }
            else if(i == 9)
            {
                realans = 'J';
            }
            else if(i == 10)
            {
                realans = 'K';
            }
            else if(i == 11)
            {
                realans = 'L';
            }
            else if(i == 12)
            {
                realans = 'M';
            }
            else if(i == 13)
            {
                realans = 'N';
            }
            else if(i == 14)
            {
                realans = 'O';
            }
            else if(i == 15)
            {
                realans = 'P';
            }
            else if(i == 16)
            {
                realans = 'Q';
            }
            else if(i == 17)
            {
                realans = 'R';
            }
            else if(i == 18)
            {
                realans = 'S';
            }
            else if(i == 19)
            {
                realans = 'T';
            }
            else if(i == 20)
            {
                realans = 'U';
            }
            else if(i == 21)
            {
                realans = 'V';
            }
            else if(i == 22)
            {
                realans = 'W';
            }
            else if(i == 23)
            {
                realans = 'X';
            }
            else if(i == 24)
            {
                realans = 'Y';
            }
            else if(i == 25)
            {
                realans = 'Z';
            }
            
            
        }
        else if(maxVal == ans[i])
        {
            realans = '?';
        }
    }
    
    if(s.length() != 1)
    {
        cout << realans;
    }
    else if(s.length() == 1)
    {
        char ans = toupper(s[0]);
        cout << ans;
    }
    
    
    return 0;
}
