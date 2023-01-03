#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {

    string s;

    cin >> s;

    for (int i = 0; i < s.length(); ++i) {
        cout << s[i] - 64 << " ";
    }

    return 0;
}
