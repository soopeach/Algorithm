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

        cout << "#" << testCase << " ";

        if (atoi(&s[s.length() - 1]) % 2 == 0) {
            cout << "Even";
        } else {
            cout << "Odd";
        }

        cout << endl;

    }

    return 0;
}
