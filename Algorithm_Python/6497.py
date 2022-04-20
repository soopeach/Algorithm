import sys
def findParent(parent, x) :
    if parent[x] != x:
        parent[x] = findParent(parent, parent[x])
    return parent[x]
def unionParent(parent, a, b):
    a = findParent(parent, a)
    b = findParent(parent, b)

    if a < b :
        parent[b] = a
    else :
        parent[a] = b


m, n = int(input().split())

parent = [0] * (m+1)
load = []

for i in range(m+1) :
    parent[i] = i

for _ in range(n) :
