//
// Created by 전현수 on 2022/12/25.
//

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int findMax(int *array, int size) {
    int max = 0;
    int maxIndex = 0;

    for (int i = 0; i < size; i++) {
        if (max < array[i]) {
            max = array[i];
            maxIndex = i;
        }
    }

    return maxIndex;
}

int main() {

    int totalTestSize = 0;
    scanf("%d", &totalTestSize);

    for (int i = 0; i < totalTestSize; i++) {

        int selectedNote[1001] = {0,};
        int noteCnt = 0;
        scanf("%d", &noteCnt);

        for (int j = 0; j < noteCnt; j++) {

            int noteNum = 0;
            scanf("%d", &noteNum);
            selectedNote[noteNum]++;

        }
        printf("%d\n", findMax(selectedNote, 1001));
    }

    return 0;
}