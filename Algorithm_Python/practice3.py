import heapq
import sys
INF = int(1e9)

cnt = 0
# 상하좌우
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

while True :
    cnt += 1
    # 동굴의 크기를 나타냄(n)
    n = int(sys.stdin.readline().rstrip())

    # n이 0이라면 반복문을 탈출
    if n == 0 : break

    distance = [INF] * (n+1)
    graph = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)]

    q = [(graph[0][0], 0, 0)]
    distance[0][0] = graph[0][0]

    while q:

        dis, x, y = heapq.heappop(q)

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or ny < 0 or nx >= n or ny >= n :
                continue

            cost = distance[x][y] +

    print("Problem " + str(cnt) +": " + str(distance[n-1][n-1]))