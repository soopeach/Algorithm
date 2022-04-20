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

    distance = [[INF] * n for _ in range(n)]
    graph = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)]

    # 시작 노드로 가기 위한 비용은 (0,0)
    x, y = 0, 0
    # 시작 노드로 가기 위한 비용은 (0,0)의 위치값으로 설정하여, q에 삽입
    q = [(graph[x][y], x, y)]
    distance[x][y] = graph[x][y]

    while q:

        dis, x, y = heapq.heappop(q)

        if distance[x][y] < dis:
            continue

        # 현재 노드와 연결된 다른 인접한 노드들을 확인
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or ny < 0 or nx >= n or ny >= n:
                continue

            cost = dis + graph[nx][ny]
            if distance[nx][ny] > cost:
                distance[nx][ny] = cost
                heapq.heappush(q, (cost, nx, ny))

    print("Problem " + str(cnt) +": " + str(distance[n-1][n-1]))