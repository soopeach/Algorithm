//
// Created by 전현수 on 2022/12/25.
//

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {

    int length = 0;

    scanf("%d", &length);
    char **wordList = malloc(sizeof (char*) * length);

    for (int i = 0; i < length; i++) {
        char *word = malloc(sizeof(char) * length);
        scanf("%s", word);
        wordList[i] = word;
    }

    for (int i = 0; i < length; i++) {

        char *horizontal = malloc(sizeof(char) * length);
        char *vertical = malloc(sizeof(char) * length);

        for (int j = 0; j < length; j++) {
            horizontal[j] = wordList[i][j];
            vertical[j] = wordList[j][i];
        }

        if (strcmp(horizontal, vertical) != 0) {
            printf("NO");
            return 0;
        }
    }

    printf("YES");
    return 0;
}