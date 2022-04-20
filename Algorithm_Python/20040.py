import sys
input = sys.stdin.readline
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

cycled = False

n, m = map(int,input().split())

parent = [0] *(n+1)
for i in range(n+1):
    parent[i] = i

for cnt in range(m) :
    a, b = map(int,input().split())

    if findParent(parent, a) == findParent(parent, b):
        cycled = True
        ans = cnt +1
        break

    unionParent(parent, a, b)

if cycled == False :
    print(0)
else :
    print(ans)
