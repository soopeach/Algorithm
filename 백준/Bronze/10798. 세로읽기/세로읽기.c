#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main() {

    char **wordList = (char **) malloc(sizeof(char *) * 5);

    for (int i = 0; i < 5; i++) {
        char *word = (char *) malloc(sizeof(char) * 15);

        scanf("%s", word);
        wordList[i] = word;
    }

    for (int i = 0; i < 15; i++) {
        for (int j = 0; j < 5; j++) {
            if (wordList[j][i] != NULL) {
                printf("%c", wordList[j][i]);
            }
        }
    }

    return 0;
}