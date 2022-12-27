#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

char *reversedWord(char *word) {
    char *reversedWord = (char *) malloc(sizeof(char) * 10);
    int index = 0;

    for (int i = 0; i < 10; ++i) {
        if (word[9 - i] != NULL) {
            reversedWord[index] = word[9 - i];
            index++;
        }
    }
    return reversedWord;
}

int main() {

    int cnt;

    scanf("%d", &cnt);

    for (int i = 0; i < cnt; i++) {

        char *word = (char *) malloc(sizeof(char) * 10);
        scanf("%s", word);

        int num = atoi(reversedWord(word)) + atoi(word);
        char *sumWord = (char *) malloc(sizeof(char) * 10);
        sprintf(sumWord, "%d", num);

        if (strcmp(sumWord, reversedWord(sumWord)) == 0) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }

    return 0;
}
