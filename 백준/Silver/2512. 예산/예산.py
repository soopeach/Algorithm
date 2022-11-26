'''
국가 예산
'''

import sys

# 지방의 수(n)을 입력 받음
n = int(sys.stdin.readline().rstrip())

# 지방의 예산요청(req)을 공백기준으로 입력 받음
req = list(map(int, sys.stdin.readline().rstrip().split()))

# 총 예산(m)을 입력 받음
m = int(sys.stdin.readline().rstrip())

# 이진탐색을 위하여 오름차순 정렬
req.sort()

start = 1
end = max(req)
result = 0
mtotal = 0

# 이진 탐색
while (start <= end):

    total = 0
    mid = (start + end) // 2

    # 하나씩 비교해보기
    for x in req:
        if x > mid:
            total += mid  # 220
        else:
            total += x
    if total <= m:
        start = mid + 1
        result = mid
    else:
        end = mid - 1

print(result)
