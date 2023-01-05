#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {

    int testCnt;

    cin >> testCnt;

    cin.ignore();
    for (int testCase = 1; testCase <= testCnt; ++testCase) {

        string s;
        getline(cin, s);
        bool isLastSpace = false;

        cout << "#" << testCase << " " << char(s[0] - 32);

        for (int i = 1; i < s.length(); ++i) {
            if (s[i] == ' ') {
                isLastSpace = true;
            } else if (isLastSpace) {
                isLastSpace = false;
                cout << char(s[i] - 32);
            }
        }

        cout << endl;

    }

    return 0;
}
