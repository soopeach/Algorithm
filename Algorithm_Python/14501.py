# 남은 n일을 입력 받음
n = int(input())
# t는 상담을 완료하는데 걸리는 기간
# p는 상담을 했을 때 받을 수 있는 금액
t, p = [], []

# DP를 이용하기 위하여 d라는 리스트를 0으로 초기화
# d[i] 에는 i+1일째에 얻을 수 있는 최대수익이 담기게 됨
d = [0] * 16

# t,p 정보를 입력 받음
for _ in range(n):
    input_data = input().split()
    t.append(int(input_data[0]))
    p.append(int(input_data[1]))

# 뒤에서 부터 맨 처음 까지 탐색을 시작
for i in range(n-1, -1, -1) :

    if i + t[i] <= n:
        d[i] = max(d[i + 1], p[i] + d[i + t[i]])
    else :
        d[i] = d[i + 1]

print(d[0])