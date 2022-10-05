import sys
n = int(sys.stdin.readline().rstrip())
graph = []
cnt = 0
global ans
ans = 0
ans_list = []
for _ in range(n) :
    graph.append(list(map(int,sys.stdin.readline().rstrip())))

#상하좌우 찾아보는 함수
def dfs(x,y) :
    global ans
    # 범위를 넘어가면 즉시 탈풀
    if x <= -1 or x >= n or y <= -1 or y >= n :
        return False

    if graph[x][y] == 1 :
        ans += 1
        graph[x][y] = 0

        dfs(x+1, y)
        dfs(x-1, y)
        dfs(x, y+1)
        dfs(x, y-1)
        return True

    return False


for i in range(n) :
    for j in range(n):
        if dfs(i,j) == True :
            cnt += 1
            ans_list.append(ans)
            ans = 0

ans_list.sort()
print(cnt) # 단지수
for i in ans_list :
    print(int(i))