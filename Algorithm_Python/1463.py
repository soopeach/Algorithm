import sys

# 정수 n을 입력 받음
n = int(sys.stdin.readline().rstrip())

# n+1개만큼 리스트를 초기화
# ex) d[3]은 3을 1로 만드는데 드는 최소 연산 횟수가 담기게 됨.
d = [0] * (n + 1)

# 2부터 n까지 1을 만들기 위한 최소 연산 횟수를 구함.
for i in range(2,n+1) :

    # 3. 1을 뺀다.
    d[i] = d[i-1] + 1
    # 1. n이 3으로 나누어 떨어지면, 3으로 나눈다.
    if i % 3 == 0 :
        d[i] = min(d[i//3] + 1, d[i])
    # 2. n이 2로 나누어 떨어지면, 2로 나눈다.
    if i % 2 == 0 :
        d[i] = min(d[i//2]+1, d[i])

print(d[n])

