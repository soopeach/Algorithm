n, k = map(int, input().split())

circle = [ i+1 for i in range(n)]

# 제거되었는지 판달할 것임 -1은 제거가 안되었다는 것
check = [-1] * n
yos = [k]

check[k-1] = 0
i = k-1

while len(yos) < n :

    for _ in range(k) :
        i += 1
        if i >= n:
            i -= n
        while check[i] != -1 :
            i += 1
            if i >= n:
                i -= n

    yos.append(circle[i])

    check[i] = 0

print("<", end="")
for i in range(n-1):
    print(yos[i], end=", ")
print(str(yos[-1])+">")