#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int gcd(int a, int b) {
    return b ? gcd(b, a % b) : a;

}

int main() {

    int cnt;

    scanf("%d", &cnt);

    for (int i = 0; i < cnt; i++) {
        int a, b;
        scanf("%d %d", &a, &b);

        if (a > b) {
            printf("%d\n", gcd(a, b));
        } else {
            printf("%d\n", gcd(b, a));
        }
    }

    return 0;
}
