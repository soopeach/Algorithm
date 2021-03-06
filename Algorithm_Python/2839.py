# 배달해야하는 설탕의 무게(n)을 입력 받음
n = int(input())

# d 리스트는 배달하는 봉지의 최소 개수를 담을 리스트임
# DP를 사용하여 문제를 풀기위해 N의 최대 범위인 5000으로 5001개만큼 초기화
# 5001개의 리스트를 생성한 이유는 인덱스가 0번째 부터 세기 때문에 1번째 부터 세기 위하여
# 5000이라는 값으로 초기화한 이유는 최대 봉지의 수가 n의 최대 범위인 5000보다 클 수가 없기 때문
# 1e9와 같은 더 큰 수로 초기화 해주어도 됨
d = [5000] * 5001

# 3키로와 5키로는 각각 하나의 봉지만 있으면 되기 때문에 1로 초기화
d[3] = d[5] = 1

# 6부터 n까지 무게를 1씩 늘려가며 필요한 최소 봉지 수를 계산한다.
for i in range(6,n+1) :

    # d[i]는 무게가 i일 때 배달하는 최소 봉지의 수가 담기는 리스트임
    # 6에서 부터 순차적으로 d[i-3], d[i-5] 한 값을 비교하여 더 작은 값을 찾고 +1을 해줌
    # ex)d[3],d[5] = 1, d[6],d[8] = 2
    # d[6]을 예시로 들면 d[3] = 1, d[2] = 5000로 d[3]+1 인 2가 d[6]에 담기게됨
    # 만약 나누어 떨어지지 않는다면 5000, 5001, 5002...으로 숫자가 늘어날 것임
    # ex) d[2],d[4] = 5000 / d[7] = 5001 ...
    d[i] = min(d[i-3], d[i-5]) +1

# if문의 조건이 == 5000이 아닌 이유는
# 7을 예시로 들자면 d[7-3]인 d[4]와 d[7-5] d[2]가 이미 5000이기 때문에
# d[7]는 5001이 된다.
if d[n] >= 5000 :
    print(-1)
else:
    print(d[n])

