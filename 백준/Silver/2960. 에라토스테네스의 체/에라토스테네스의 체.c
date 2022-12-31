#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int count = 0;

int findMinNum(int *array, int size) {
    for (int i = 2; i < size; i++) {
        if (array[i] != 0) return array[i];
    }
    return 0;
}

int main() {

    int n;
    int k;

    scanf("%d %d", &n, &k);

    int *numArray = (int *) malloc(sizeof(int) * n + 1);

    for (int i = 2; i < n + 1; i++) {
        numArray[i] = i;
    }

    while (true) {

        int prime = findMinNum(numArray, n + 1);

        for (int i = 2; i < n + 1; i++) {
            if (numArray[i] != 0 && numArray[i] % prime == 0) {
                count++;
                if (count == k) {
                    printf("%d", numArray[i]);
                    return 0;
                }
                numArray[i] = 0;
            }
        }
    }

}
