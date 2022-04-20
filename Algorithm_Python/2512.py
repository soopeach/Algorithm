# 2512 예산 문제
import sys

# 지방의 수(n)을 입력 받음
n = int(sys.stdin.readline().rstrip())

# 지방의 예산요청(req)을 공백기준으로 입력 받음
req = list(map(int, sys.stdin.readline().rstrip().split()))

# 총 예산(m)을 입력 받음
m = int(sys.stdin.readline().rstrip())

# 이진탐색을 위하여 오름차순 정렬
req.sort()

# 예산의 최솟값(시작점)
start = 1
# 예산의 최댓값(끝점)
end = max(req)
# 정답을 담을 변수
result = 0

# parametric search
# 파라메트릭 서치를 활용하여
# 시작점이 끝점보다 커지면 탐색 종료
while (start <= end):

    # 배정한 예산
    total = 0

    # 줄 수 있는 최대 예산
    mid = (start + end) // 2

    # 하나씩 비교해보기
    # 각 지방의 요청 예산(req)이 줄 수 있는 최대 예산(mid) 보다 크면
    # 줄 수 있는 최대 예산(mid)이상은 줄 수 없기 때문에
    # 배정한 예산(total)에 줄 수 있는 최대 예산(mid)만큼 증가
    for x in req:
        if x > mid:
            total += mid
        # 지방 별 요청 예산(x)이 최대 예산(mid) 보다 작으면 요청한 만큼만 주면 되므로
        # 요청 예산만큼 배정한 예산(total)을 증가
        else:
            total += x


    # 배정한 예산(total)이 총 예산(m)보다 같거나 적다면
    # 줄 수 있는 최대 예산(mid)를 늘려줘야 하므로
    # start = mid + 1를 해주어 다음 줄 수 있는 최대 예산(mid)이 증가하게 만들어줌.
    # result(정답값)에 현재 줄 수 있는 최대 예산(mid)를 넣어줌.
    if total <= m:
        start = mid + 1
        result = mid
    # 배정한 예산(total)이 총 예산(m)보다 크다면 줄 수 있느 최대 예산(mid)를 줄여야 하므로
    # end = mid - 1을 해주어 다음 줄 수 있는 최대 예산(mid)을 줄여줌.
    else:
        end = mid - 1

print(result)
