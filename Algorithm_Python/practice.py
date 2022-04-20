# 남은 n일을 입력 받음
n = int(input())
# t는 상담을 완료하는데 걸리는 기간
# p는 상담을 했을 때 받을 수 있는 금액
t, p = [0] * 10000, [0] * 10000

# DP를 이용하기 위하여 d라는 리스트를 0으로 초기화
# d[i] 에는 n-i일째에 얻을 수 있는 최대수익이 담기게 됨
d = [0] * 10000

# t,p 정보를 입력 받음
for i in range(1, n+1):
    input_data = input().split()
    t[i] = int(input_data[0])
    p[i] = int(input_data[1])

# 뒤에서 부터 탐색
for i in range(n, -1, -1) :

    if i + t[i] <= n+1 :
        d[i] = max(d[i + 1], p[i] + d[i + t[i]])
    else :
        d[i] = d[i + 1]


print(d[1])
