import sys

# 10억(무한을 나타내기 위하여 큰 정수로 설정)
INF = int(1e9)

# 도시의 개수(n), 버스의 개수(m)
n = int(input())
m = int(input())

# '모든 노드에서 다른 모든 노드까지의 최단 거리'를 저장하기 위해
# 2차원 리스트를 사용 - 모든 값을 INF로 초기화
graph = [[INF] * (n + 1) for _ in range(n + 1)]

# 자기 자신에서 자기 자신으로 가는 비용은 0으로 초기화
for a in range(1, n + 1):
    for b in range(1, n + 1):
        if a == b:
            graph[a][b] = 0

# 버스의 정보를 입력 받음
for _ in range(m):
    a, b, c = map(int, sys.stdin.readline().rstrip().split())
    if graph[a][b] > c:
        graph[a][b] = c

# 플로이드 워셜 알고리즘을 수행
for k in range(1, n + 1):
    for a in range(1, n + 1):
        for b in range(1, n + 1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

# 조건에 맞게 2차원 리스트를 출력
for a in range(1, n + 1):
    for b in range(1, n + 1):
        if graph[a][b] == INF :
            print(0, end =" ")
        else :
            print(graph[a][b], end=" ")
    print()
