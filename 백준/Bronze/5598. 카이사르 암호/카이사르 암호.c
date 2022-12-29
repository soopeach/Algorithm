#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int main() {

    char *caesarWord = (char *) malloc(sizeof(char) * 1000);

    scanf("%s", caesarWord);

    for (int i = 0; i < 1000; i++) {
        if (caesarWord[i] == NULL) break;

        if (caesarWord[i] <= 'C') {
            printf("%c", caesarWord[i] + 23);
        } else {
            printf("%c", caesarWord[i] - 3);
        }
    }

    return 0;
}
