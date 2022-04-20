import sys
m, n = map(int, sys.stdin.readline().rstrip().split())

# 소수인 값들을 넣을 리스트(정답)
prime = []

# 1은 소수가 아님
if m == 1 : m += 1

for i in range(m, n+1) :

    # 2는 유일하게 짝수 중에서 소수
    # 2일 경우를 제외하고 모든 짝수에서는 소수판별을 하지 않음
    if i != 2 and i % 2 == 0 :
        continue

    # 우선 prime 리스트에 넣어놓고 소수판별 후 소수가 맞다면 유지 아니라면
    # prime리스트에서 제거할 것임.
    prime.append(i)

    for j in range(2, int(i** 0.5)+1) :
        # 만약 1과 자기 자신 이외의 수로 나누어진다면 소수가 아니므로
        # prime 리스트에서 제거
        if i % j == 0 :
            del prime[-1]
            break

# 소수들 한 줄에 하나씩 순차적으로 출력
for i in prime :
    print(i)