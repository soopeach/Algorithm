#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {

    int target;

    cin >> target;

    for (int i = 1; i <= target; ++i) {
        if (target % i == 0) cout << i << " ";
    }

    return 0;
}