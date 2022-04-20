import sys
sys.setrecursionlimit(10**7)
input = sys.stdin.readline


def findParent(parent,x) :
    if parent[x] != x:
        parent[x] = findParent(parent, parent[x])
    return parent[x]

def unionParent(parent, a, b) :
    a = findParent(parent,a)
    b = findParent(parent,b)
    if a < b:
        parent[b] = a
    else :
        parent[a] = b

n, m = map(int, input().split())

parent = [0] * (n+1)
for i in range(1, n+1):
    parent[i] = i

for _ in range(m):
    command, a, b = map(int, input().split())

    # 합집합 연산(union)
    if command == 0 :
        unionParent(parent,a , b)
    # 두 원소가 같은 집합에 포함되어 있는지
    # 확인하는 연산
    elif command == 1 :
        if findParent(parent,a) == findParent(parent, b) :
            print("YES")
        else :
            print("NO")