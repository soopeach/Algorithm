#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int main() {

    int target;
    int *fibo = (int*)malloc(sizeof(int) * 46);

    fibo[0] = 0;
    fibo[1] = 1;
    fibo[2] = 1;

    scanf("%d", &target);

    for (int i = 3; i <= target; ++i) {
        fibo[i] = fibo[i - 1] + fibo[i - 2];
    }

    printf("%d", fibo[target]);

    return 0;
}
