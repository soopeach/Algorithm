def findParent(parent, x):
    if parent[x] != x:
        parent[x] = findParent(parent, parent[x])
    return parent[x]

def unionParent(parent, a, b) :
    if a < b :
        parent[b] = a
    else :
        parent[a] = b

t = int(input())

for _ in range(t):

    f = int(input())
    parent = [False] * (f+1)

    for i in range(1, f+1):
        parent[i] = False

    for _ in range(t):

        a, b = input().split()

