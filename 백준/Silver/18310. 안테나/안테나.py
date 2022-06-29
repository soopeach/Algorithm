import sys
n = int(sys.stdin.readline().rstrip())
home = list(map(int, sys.stdin.readline().rstrip().split())) # [5, 1, 7, 9]
home.sort() # [1, 5, 7, 9] / 오름차순으로 정렬
min_length = 100000000000000000000000
'''
반복문을 돌려 home 원소 하나씩 그리고 그 원소와
나머지 홈 원소의 집이 같을 때마다 그 거리만큼 ans에 담아준다.
'''
k = len(home) // 2

for i in range(k-1, k+1) :
    length = 0
    for j in home :
        length += abs(home[i]-j)

    if (length < min_length) :
        min_length = length
        ans = home[i]




'''
# 중간만 어떻게 탐색을 해볼까용?
for antenna in home :
    length = 0
    for house in home :
        length += abs(antenna - house)

    if ans > length :
        min_length = length
        ans = antenna
        '''

print(ans)