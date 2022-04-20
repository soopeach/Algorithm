int main() {
    int x = 0;
    int y = 0;
    scanf("%d", &x);
    scanf("%d", &y);


    int firstAns = x * (y%10);
    int thirdAns = x * (y/100);
    int ans = y-(y/100) * 100;
    int secondAns = x * (ans/10);

    // first
    printf("%d\n", firstAns);
    // second
    printf("%d\n", secondAns);
    // third
    printf("%d\n", thirdAns);
    // result
    printf("%d", thirdAns * 100 + secondAns * 10 + firstAns);

    return 0;
}