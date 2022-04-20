# 2110번 공유기 설치

import sys
# 집의 수(n) 공유기의 수(c)를 입력 받음
n, c = map(int, sys.stdin.readline().rstrip().split())


house = []
# 집의 위치 좌표를 입력 받음
for _ in range(n):
    house.append(int(sys.stdin.readline().rstrip()))

# 파라메트릭 서치를 이용하기 위하여 오름차순으로 정렬
house.sort()

# 공유기 사이의 최소 거리
start = 1
# 공유기 사이의 최대 거리
# 가장 멀리떨어져 있는 집 사이의 거리가
# 공유기 사이의 최대 거리
end = max(house) - 1
# 결과를 담을 변수
result = 0


while (start <= end) :

    # mid는 가장 인접한 두 공유기 사이의 거리(공유기 사이의 최소거리)
    mid = (start+end) // 2
    # 집의 첫번째 위치에서 부터 탐색 시작
    cur = house[0]
    # 첫번째 위치에 공유기를 설치하고 탐색하기 때문에 count는 1 부터 시작
    count = 1

    # 현재위치(cur)에서 공유기 사이의 최소거리(mid)를 더한 값이 다음 집 위치 보다 작다면
    # 다음 집에 공유기를 설치!(공유기를 설치했기때문에 count += 1)
    # cur도 그 위지(routher[i]) 설정
    for i in range(1, len(house)) :
        if cur + mid <= house[i]:
            cur = house[i]
            count += 1

    # 공유기의 개수(c)보다 설치한 공유기의 개수(count)가 더 적으면
    # 공유기 사이의 거리를 줄여 공유기를 더 설치해야하므로
    # end = mid - 1을 해주어 다음 mid값을 줄이고 다시 탐색
    if count < c :
        end = mid - 1
    # result에 mid값을 먼저 넣어줌.
    # start > end까지 탐색하면서 갱신되고
    # 결국 가장 조건에 부합하는 값이 result에 들어가게됨(파라메트릭 서치)
    # 공유기의 개수(c)보다 설치한 공유기의 개수(count)가 크거나 같다면
    # 공유기 사이의 거리를 늘려 공유기를 덜 설치해야하므로
    # start = mid + 1을 해주어 다음 mid값을 늘리고 다시 탐색
    else :
        result = mid
        start = mid + 1

print(result) 