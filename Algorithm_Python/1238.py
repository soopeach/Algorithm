import heapq
INF = int(1e9)

# n은 노드 m은 간선 수 x는 도착 점
n, m, x = map(int, input().split())

graph = [[] for _ in range(n+1)]

start = [0] * (n+1)
ans = [0] * (n+1)

for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a].append((b,c))

def dijkstra(start) :

    distance = [INF] * (n + 1)
    q = []
    distance[start] = 0

    heapq.heappush(q, (0, start))

    while q:

        dis, now = heapq.heappop(q)

        if distance[now] < dis :
            continue

        for i in graph[now] :
            cost = dis + i[1]

            if distance[i[0]] > cost :
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

    return distance

for i in range(1, n+1) :

     start[i] = dijkstra(i)

for i in range(1, n+1) :

    ans[i] = start[i][x] + start[x][i]

print(max(ans))