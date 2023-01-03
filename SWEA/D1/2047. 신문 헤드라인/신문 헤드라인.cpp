#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {

    string headLine;

    cin >> headLine;

    for (int i = 0; i < headLine.length(); ++i) {

        if (97 <= headLine[i] && headLine[i] <= 122) {
            cout << char(headLine[i] - 32);
        } else {
            cout << headLine[i];
        }
    }

    return 0;
}
