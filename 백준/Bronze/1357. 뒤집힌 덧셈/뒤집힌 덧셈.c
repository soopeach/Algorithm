#include <stdio.h>
#include <stdlib.h>
#include <string.h>


char *revered(char *word) {
    char *newWord = (char *) malloc(sizeof(char) * 4);
    int index = 0;
    for (int i = 0; i < 4; i++) {
        if (word[3 - i] != NULL) {
            newWord[index++] = word[3 - i];
        }

    }

    return newWord;
}

int main() {

    char *fir = malloc(sizeof(char) * 4);
    char *sec = malloc(sizeof(char) * 4);
    scanf("%s %s", fir, sec);

    char *sum = malloc(sizeof(char) * 4);
    sprintf(sum, "%d", atoi(revered(fir)) + atoi(revered(sec)));

    printf("%d", atoi(revered(sum)));

    return 0;
}