import sys
INF = int(1e9)
ans = INF
input = sys.stdin.readline

v, e = map(int, sys.stdin.readline().rstrip().split())

graph =[[INF] * (v+1) for _ in range(v+1)]

for a in range(1, v+1) :
    for b in range(1, v+1) :
        if a == b :
            graph[a][b] = 0

for _ in range(e) :
    a, b, c = map(int, input().split())
    graph[a][b] = c

for k in range(1, v+1) :
    for a in range(1, v + 1):
        for b in range(1, v + 1):
            graph[a][b] = min(graph[a][b], graph[a][k] + graph[k][b])

            if graph[a][b] != 0 and graph[a][b] != INF and graph[b][a] != 0 and graph[b][a] != INF:
                ans = min(ans, graph[a][b] + graph[b][a])

if ans == INF :
    print(-1)
else :
    print(ans)