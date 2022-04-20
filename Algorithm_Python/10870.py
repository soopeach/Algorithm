# n번째 피보나치 수를 출력해야 하므로 n을 입력받음
n = int(input())

# n이 0이 아니면
if n != 0 :

    d = [0] * (n+1)
    d[1] = 1

    # 다이나믹 프로그래밍 기법을 사용하여 피보나치 수를 구함.
    for i in range(2, n+1):
        d[i] = d[i-1] + d[i-2]

    print(d[n])
# n이 0 이라면
else :
    print(0)