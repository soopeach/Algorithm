#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {

    int testCnt;

    cin >> testCnt;

    for (int testCase = 1; testCase <= testCnt; ++testCase) {

        char **stringArray = (char **) std::malloc(sizeof(char *) * 5);

        for (int i = 0; i < 5; ++i) {
            char *s = (char *) ::malloc(sizeof(char) * 15);
            cin >> s;
            stringArray[i] = s;
        }

        cout << "#" << testCase << " ";

        for (int i = 0; i < 15; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (stringArray[j][i] != NULL) {
                    cout << stringArray[j][i];
                }
            }
        }

        cout << endl;

    }

    return 0;
}
