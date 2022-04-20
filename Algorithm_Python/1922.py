import sys
input = sys.stdin.readline

def findParent(parent, x) :
    if parent[x] != x :
        parent[x] = findParent(parent, parent[x])
    return parent[x]

def unionParent(parent, a, b) :
    a = findParent(parent, a)
    b = findParent(parent, b)
    if a < b :
        parent[b] = a
    else :
        parent[a] = b


n = int(input())
m = int(input())

result = 0

parent = [0] * (n+1)
for i in range(n+1):
    parent[i] = i

line = []
for _ in range(m) :
    a, b, cost = map(int, input().split())
    line.append((cost, a, b))

line.sort()

for check in line :
    cost, a, b = check
    if findParent(parent, a) != findParent(parent, b):
        unionParent(parent, a, b)
        result += cost

print(result)



