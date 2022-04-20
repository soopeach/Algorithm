import heapq
INF = int(1e9)

n = int(input())
m = int(input())

graph = [[] for _ in range(n+1)]
cnt = 0

for _ in range(m) :
    a, b, c = map(int, input().split())
    graph[a].append((b,c))

start, end = map(int, input().split())

def dijkstra(start) :
    distance = [INF] * (n+1)
    distance[start] = 0

    q = []
    heapq.heappush(q, (0, start))

    while q :
        dis, now = heapq.heappop(q)

        if distance[now] < dis :
            continue

        for i in graph[now] :
            cost = dis + i[1]

            if distance[i[0]] > cost :
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

    return distance

k = dijkstra(start) # [1000000000, 0, 2, 3, 1, 4]

print(k[end])

