# 총 사람수(n)과 몇번째 사람(k)을 제거할지 입력 받음
n, k = map(int, input().split())

# 총 사람 수만큼 리스트를 생성
# 1,2,3 ... n-1, n
circle = [i+1 for i in range(n)]

# 이미 제거되어있는 인덱스인지 판단하기 위해 check라는 리스트를 생성
# -1로 초기화 / -1은 아직 제거되지 않았다는 뜻
check = [-1] * n

# 제거한 사람을 모아놓을 yos리스트를 생성 후 k번째 사람을 가장 먼저 넣어둠.
yos = [k]

# k번째 사람을 제거하고 시작했기 때문에 [k-1]인덱스는 제거 처리(-1 -> 0)
check[k-1] = 0

# 인덱스를 가리킬 변수 i는 k번째 사람을 제거하고 시작했기 때문에 [k-1]인덱스부터 시작
i = k-1

# 모든 인원을 제거할 때까지 요세푸스 순열을 진행
while len(yos) < n :

    # K번째 사람을 제거해야 하기 때문에
    # 인덱스를 가리킬 변수인 i를 하나씩 늘려가며 확인
    # check[i]가 -1 이 아니라면(0이라면) 이미 제거한 곳이기 때문에
    # 수를 셀 필요가 없으므로 i += 1을 반복해줌(check[i]가 -1 일 때 까지)
    # i 가 총 인원 수(n)보다 크다면 인덱스가 초과한 것이므로 i -= n을 해주어 다시
    # 0인덱스부터 확인
    for _ in range(k) :
        i += 1
        if i >= n:
            i -= n
        while check[i] != -1 :
            i += 1
            if i >= n:
                i -= n

    yos.append(circle[i])

    # 제거 처리 (-1 -> 0)
    check[i] = 0

# 원하는 출력형식에 맞추어 출력
print("<", end="")
for i in range(n-1):
    print(yos[i], end=", ")
print(str(yos[-1])+">")