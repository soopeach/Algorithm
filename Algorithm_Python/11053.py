# 수열의 길이
a = int(input())

# 수열을 입력 받음
seq = list(map(int, input().split()))
# 1번째 인덱스부터 편하게 세기 위하여 맨 앞에 0을 넣어줌
seq.insert(0, 0)
# 미리 최대 수열의 길이만큼 리스트 초기화
d = [0] * 1001

for i in range(1, len(seq)):
    # 만약 i번째 인덱스의 크기가 1  ~ i-1번째 인덱스 사이의 모든 값보다 작다면 d[i]는 1
    d[i] = 1
    # j는 1 ~ i-1의 범위를 탐색
    for j in range(1, i) :
        # i번째 인덱스의 수열값(seq[i])이 탐색중인 j번째 인덱스의 수열값(seq[j]) 보다 크다면
        if seq[i] > seq[j] :
            # d[i]값 갱신
            d[i] = max(d[j]+1,d[i])

# LIS 출력
print(max(d))




