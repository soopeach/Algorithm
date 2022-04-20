import heapq
import sys

INF = int(1e9)

# 정점의 개수(v), 간선의 개수(e)
v, e = map(int, sys.stdin.readline().split())

# 시작 정점의 번호(start)
start = int(input())

graph = [[] for _ in range(v + 1)]

distance = [INF] * (v + 1)

for _ in range(e):
    a, b, c = map(int, sys.stdin.readline().split())
    graph[a].append((b, c))

# 우선순위 큐를 이용한 개선된 다익스트라 알고리즘
# 시간 복잡도 : O(ElngV)
def dijkstra(start):

    q = []
    # 우선순위 큐를 사용
    heapq.heappush(q, (0, start))
    # 시작 노드에서의 최소 거리는 0
    distance[start] = 0

    # 큐가 빌 때까지 반복
    while q:

        dis, now = heapq.heappop(q)

        # 해당 노드를 이미 처리한 적이 있다면 무시
        if distance[now] < dis:
            continue

        for i in graph[now]:
            cost = dis + i[1]

            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))


dijkstra(start)

for i in range(1, v + 1):

    # 경로가 존재하지 않는 경우에는 INF출력
    if distance[i] == INF:
        print("INF")
    else:
        print(distance[i])

'''
floyd - warshall 
get memory error

import sys
INF = int(1e9)

# 정점의 개수(v), 간선의 개수(e)
v, e = map(int, sys.stdin.readline().rstrip().split())

# 처음에는 20001 대신 v+1로했음
graph = [[INF] * (20001) for _ in range(20001)]
# 시작 정점의 번호(k)
k = int(input())

for _ in range(e) :
    a, b, c = map(int, sys.stdin.readline().rstrip().split())
    graph[a][b] = c

for u in range(1, v + 1):
    for v in range(1, v + 1):
        if u == v :
            graph[u][v] = 0

for t in range(1, v+1) :
    for u in range(1, v + 1):
        for v in range(1, v + 1):
            graph[u][v] = min(graph[u][v], graph[u][t] + graph[t][v])


for a in range(1, v+1) :

    if graph[k][a] == INF :
        print("INF")
    else :
        print(graph[k][a])
'''
