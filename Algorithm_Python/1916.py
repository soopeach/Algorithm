import sys
import heapq
INF = int(1e9)

# 도시의 개수(n) - 노드
# 버스의 개수(m) - 간선
n = int(input())
m = int(input())


# 버스비용을 거리라고 생각할 것임.
# 최단 거리(최소 비용) 테이블을 INF(10억)으로 초기화
distance = [INF] * (n+1)

graph =[[] for _ in range(n+1)]

# 그래프의 정보를 입력 받음(도시, 버스)
for i in range(1, m+1) :
    a, b, c = map(int, sys.stdin.readline().split())
    graph[a].append((b,c))

# 출발점(start) - 출발 노드
# 도착점(end) - 도착 노드
start, end = map(int, sys.stdin.readline().split())

# 우선순위 큐를 이용한 개선된 다익스트라 알고리즘
# 시간 복잡도 : O(mlogn)
def dijkstra(start) :
    q = []

    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q :

        dis, now = heapq.heappop(q)

        # 이미 처리된 노드라면 무시
        if distance[now] < dis :
            continue

        for i in graph[now] :
            cost = dis + i[1]

            if cost < distance[i[0]] :
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))


dijkstra(start)

print(distance[end])