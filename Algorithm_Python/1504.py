import heapq
import sys
INF = int(1e9)

n, e = map(int, sys.stdin.readline().rstrip().split())

graph = [[] for _ in range(n+1)]

for _ in range(e) :
    a, b, c = map(int, sys.stdin.readline().rstrip().split())
    graph[a].append((b,c))
    graph[b].append((a,c))

v1, v2 = map(int, sys.stdin.readline().rstrip().split())

def dijkstra(start) :
    distance = [INF] * (n + 1)
    distance[start] = 0

    q = []
    heapq.heappush(q, (0, start))

    while q :

        dis, now = heapq.heappop(q)

        for i in graph[now] :
            cost = dis + i[1]

            if distance[i[0]] > cost:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

    return distance

from_1 = dijkstra(1)
from_v1 = dijkstra(v1)
from_v2 = dijkstra(v2)

ans = min(from_1[v1] + from_v1[v2] + from_v2[n], from_1[v2] + from_v2[v1] + from_v1[n])

if ans >= INF : print(-1)
else : print(ans)






