import heapq
import sys

INF = int(1e9)

cnt = 0
# 상하좌우
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

while True:
    cnt += 1
    # 동굴의 크기를 입력 받음(n)
    n = int(sys.stdin.readline().rstrip())

    # n이 0이라면 반복문을 탈출
    if n == 0: break

    # 최단 경로를 초기화(이차원 리스트)
    distance = [[INF] * n for _ in range(n)]

    # 동굴 정보를 입력 받음
    graph = [list(map(int, sys.stdin.readline().rstrip().split())) for _ in range(n)]

    # 0,0은 무조건 거쳐야 함.
    distance[0][0] = graph[0][0]

    q = [(graph[0][0], 0, 0)]

    while q:

        # dis에는 graph[x][y]까지의 최단 경로가 저장
        # x, y에는 각각 탐색을 시작하는 지점의 x, y좌표가 저장
        dis, x, y = heapq.heappop(q)

        # 현재 노드와 연결된 다른 인접한 노드들을 확인(상, 하, 좌, 우)
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            # 범위를 벗어나면 탐색 종료
            if nx < 0 or ny < 0 or nx >= n or ny >= n:
                continue

            # 최단 경로를 갱신
            cost = dis + graph[nx][ny]

            if distance[nx][ny] > cost:
                distance[nx][ny] = cost
                heapq.heappush(q, (cost, nx, ny))

    # 문제 형식에 맞게 출력
    print("Problem " + str(cnt) + ": " + str(distance[n - 1][n - 1]))
