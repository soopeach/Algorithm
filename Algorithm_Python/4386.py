def findParent(parent, x) :
    if parent[x] != x:
        parent[x] = findParent(parent, parent[x])
    return parent[x]

def unionParent(parent, a, b) :
    a = findParent(parent,a)
    b = findParent(parent,b)
    if a < b :
        parent[b] = a
    else :
        parent[a] = b

# 별의 개수
n = int(input())
parent = [0] * (n+1)

# 별들의 좌표가 담김
star = [(0,0)] * (n+1)
# 그래프의 정보가 담김
# (cost, a, b) 가 담기는데 a 와 b 사이의 거리가 cost라는 뜻
edge = []
result = 0

for i in range(1, n+1) :
    parent[i] = i

for i in range(1, n+1) :
    x, y = input().split()
    star[i] = (float(x), float(y))

# 별사이의 거리(cost)를 구하여 edge에 담음
for i in range(1, n+1) :
    for j in range(i+1, n+1) :
        # 점 a, b사이의 거리는
        # 점 a와 b의 x좌표의 차의 제곱 + 점 a와 b의 y좌표의 차의 제곱을 루트

        # 점 a, b의 x좌표 차의 제곱
        xdif = (star[j][0] - star[i][0]) ** 2
        # 점 a, b의 ㅛ좌표 차의 제곱
        ydif = (star[j][1] - star[i][1]) ** 2

        # 점 a, b사이의 거리
        cost = (xdif+ydif) ** 0.5
        edge.append((cost, i, j))

# 비용순으로 정렬
edge.sort()

for k in edge :
    cost, a, b = k

    # 사이클이 발생하지 않는 경우에만 집합에 포함
    if findParent(parent, a) != findParent(parent, b):
        unionParent(parent,a, b)
        result += cost

# 소수점 둘째 자리까지만 출력해야하기 때문에 round함수를 사용
print(round(result, 2))