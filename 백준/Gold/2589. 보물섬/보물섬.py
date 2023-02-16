import sys
from collections import deque
n, m = map(int, sys.stdin.readline().rstrip().split())
graph = []
global ans
ans = 0

#     상 하 좌 우
dx = [-1, 1, 0 ,0]
dy = [0, 0, -1, 1]

# 최단거리를 측정할 distance 리스트 생성
# -1은 방문하지 않았다는 뜻이고 시작점을 0으로 만들어줄 것
# distance = [[-1] * m for _ in range(n)]

# graph에 보물지도의 정보 입력
# 바다(W)는 이동 불가 육지(L)로만 이동 가능
for _ in range(n) :
    graph.append(list(sys.stdin.readline().rstrip()))

'''
보물은 서로간에 최단 거리로 이동하는데 있어 가장 긴 시간이 걸리는 육지 두곳에 존재한다
보물이 묻혀있는 두 곳 사이를 최단 거리로 이동하는 시간을 출력해라
'''

# 너비우선 탐색
def Bfs(x,y) :

    global ans

    queue = deque()
    # 시작점인(x, y)를 큐에 넣어줌
    queue.append((x,y))

    # queue가 빌 때까지 반복
    while queue :

        x, y = queue.popleft()

        # 4방향으로 탐색
        for i in range(4) :
            nx = x + dx[i]
            ny = y + dy[i]

            # 범위 초과시 무시
            if nx < 0 or nx >= n or ny < 0 or ny >= m :
                continue
            # 탐색한 곳이 바다(W)이면 무시
            if graph[x][y] == "W" :
                continue
            # 탐색한 곳이 길(L)이면서 distance가 미 방문한 곳이라면(-1)
            if graph[nx][ny] == "L" and distance[nx][ny] == -1 :
                distance[nx][ny] = distance[x][y] + 1
                queue.append((nx, ny))
                ans = max(distance[nx][ny], ans)

    return ans





# 그래프의 (0,0)부터 (n,m)까지 탐색
for i in range(n) :
    for j in range(m) :
        # graph[i][j](탐색시작 지점)이 육지(L)이라면 탐색 시작
        if graph[i][j] == "L":
            # 탐색 전 distance정보를 초기화
            distance = [[-1] * m for _ in range(n)]
            # 탐색 시작점을 0으로 설정
            distance[i][j] = 0
            # 너비우선 탐색 시작
            Bfs(i,j)


print(ans)


