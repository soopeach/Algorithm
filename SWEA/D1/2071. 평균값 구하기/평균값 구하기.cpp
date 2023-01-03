#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {

    int testCnt;

    cin >> testCnt;

    for (int testCase = 1; testCase <= testCnt; ++testCase) {

        double sum = 0;

        for (int i = 0; i < 10; ++i) {
            double num = 0;
            cin >> num;
            sum += num;
        }

        cout << "#" << testCase << " " << floor(sum / 10 + 0.5) << endl;
    }
    
    return 0;
}
