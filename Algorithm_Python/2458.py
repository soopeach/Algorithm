INF = int(1e9)
n, m = map(int, input().split())

height = [[INF] * (n+1) for _ in range(n+1)]
print(height)

for _ in range(m) :
    a, b = map(int, input().split())