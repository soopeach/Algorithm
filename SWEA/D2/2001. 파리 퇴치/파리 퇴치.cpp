#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int testCnt, boardSize, weaponSize, maxKillFlyCnt;

    cin >> testCnt;

    for (int testCase = 1; testCase <= testCnt; ++testCase) {

        maxKillFlyCnt = 0;
        cin >> boardSize >> weaponSize;

        int board[boardSize][boardSize];

        for (int i = 0; i < boardSize; ++i) {
            for (int j = 0; j < boardSize; ++j) {
                cin >> board[i][j];
            }
        }

        for (int i = 0; i < boardSize - weaponSize + 1; ++i) {
            for (int j = 0; j < boardSize - weaponSize + 1; ++j) {
                int curKillFlyCnt = 0;

                for (int weaponX = 0; weaponX < weaponSize; ++weaponX) {
                    for (int weaponY = 0; weaponY < weaponSize; ++weaponY) {
                        curKillFlyCnt += board[i + weaponX][j + weaponY];
                    }
                }

                if (maxKillFlyCnt < curKillFlyCnt) maxKillFlyCnt = curKillFlyCnt;
            }
        }

        cout << "#" << testCase << " " << maxKillFlyCnt << endl;

    }

    return 0;
}
