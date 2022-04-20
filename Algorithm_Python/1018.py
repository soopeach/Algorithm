n, m = map(int, input().split())

chess = []
count = 0

ans = 10000

for _ in range(n):
    chess.append(list(input()))

if chess[0][0] == "W":

    # 앞이 짝수일 땐 뒤도 짝수 w
    # 앞이 홀수일 땐 뒤도 홀수여야 W

    for i in range(n):
        for j in range(m):
            if i % 2 == 0 and j % 2 == 0:
                if chess[i][j] != "W":
                    chess[i][j] = "W"
                    count += 1
            if i % 2 != 0 and j % 2 != 0:
                if chess[i][j] != "W":
                    chess[i][j] = "W"
                    count += 1
            if i % 2 == 0 and j % 2 != 0 :
                if chess[i][j] != "B":
                    chess[i][j] = "B"
                    count += 1
            if i % 2 != 0 and j % 2 == 0 :
                if chess[i][j] != "B":
                    chess[i][j] = "B"
                    count += 1

else :

    for i in range(n):
        for j in range(m):
            if i % 2 == 0 and j % 2 == 0:
                if chess[i][j] != "B":
                    chess[i][j] = "B"
                    count += 1
            if i % 2 != 0 and j % 2 != 0:
                if chess[i][j] != "B":
                    chess[i][j] = "B"
                    count += 1
            if i % 2 == 0 and j % 2 != 0 :
                if chess[i][j] != "W":
                    chess[i][j] = "W"
                    count += 1
            if i % 2 != 0 and j % 2 == 0 :
                if chess[i][j] != "W":
                    chess[i][j] = "W"
                    count += 1


print(count)
