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

parent = [0] * (n+1)
for i in range(1, n+1) :
    parent[i] = i

finished = False
city = []
cityGraph = [] # [(1, 1, 2), (1, 2, 1), (1, 2, 3), (1, 3, 2)]
for i in range(n) :
    city.append(list(map(int, input().split())))

plan = list(map(int, input().split()))
ansList =[]

for i in range(n) :
    for j in range(n) :
        if city[i][j] == 1 :
            # i+1 번째 도시와 j+1번째 도시가 이어졌다는 것
            cityGraph.append((i+1,j+1))

for citys in cityGraph:
    a, b = citys
    if findParent(parent,a) != findParent(parent,b) :
        unionParent(parent ,a, b)
        ansList.append(a)
        ansList.append(b)

for check in plan :
    if check not in ansList:
        print("NO")
        finished = True
        break

if finished == False :
    print("Yes")

pc.py 에 정답이 잇음