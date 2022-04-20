import sys

# n은 나무의 수 m은 집으로 가져가려고 하는 나무의 길이
n, m = map(int, sys.stdin.readline().rstrip().split())

# 나무의 높이들
wood = list(map(int, sys.stdin.readline().rstrip().split()))

# 이분 탐색을 위하여 오름차순 정렬
wood.sort()

# 최소 절단기의 높이
start = 1
# 최대 절단기의 높이
end = max(wood)
# 결과값을 넣을 변수
result = 0


while start <= end:

    # 잘려진 나무의 길이의 합(total)를 담을 변수
    total = 0

    # 절단기의 높이(mid)
    mid = (start + end) // 2

    # 나무를 하나씩 꺼내어(x) 순차적으로 절단기의 길이(mid)와 비교하여
    # 나무의 길이(x)가 더 길다면 절단기의 길이(mid)만큼 잘라서
    # 잘려진 나무의 길이의 합(total)에 넣음.
    for x in wood :
        if x > mid :
            total += x - mid

    # 잘려진 나무의 길이(total)의 합이 필요한 나무의 길이(m)보다 작다면
    # 나무를 더 많이 잘라야 하므로 절단기의 높이(mid)를 짧게 해야한다.
    # end = mid - 1하여 다음 절단기의 높이(mid)를 줄인 후 다시 탐색
    if total < m :
        end = mid -1
    # 우선 결과 값(result)에 현재 절단기의 높이(mid)를 넣어줌.
    # 탐색을 반복하며 결과 값(result)에 조건에 부합하는 값이 들어가게 됨.
    # 잘려진 나무의 길이(total)의 합이 필요한 나무의 길이(m)보다 크거나 같다면
    # 나무를 덜 잘라야 하므로 절단기의 높이(mid)를 길게 해야한다.
    # start = mid + 1하여 다음 절단기의 높이(mid)를 늘린 후 다시 탐색
    else :
        result = mid
        start = mid + 1

print(result)