#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

void swap(int *array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

void sort(int *array, int size) {

    int minIndex;

    for (int i = 0; i < size; ++i) {
        minIndex = i;
        for (int j = i + 1; j < size; ++j) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        swap(array, i, minIndex);
    }
}

int main() {

    int testCnt;

    cin >> testCnt;

    for (int testCase = 1; testCase <= testCnt; ++testCase) {

        int numCnt;
        cin >> numCnt;

        int numArray[numCnt];

        for (int i = 0; i < numCnt; ++i) {
            int curNum;
            cin >> curNum;
            numArray[i] = curNum;
        }

        sort(numArray, numCnt);

        cout << "#" << testCase << " ";

        for (int i = 0; i < numCnt; ++i) {
            cout << numArray[i] << " ";
        }

        cout << endl;

    }

    return 0;
}
