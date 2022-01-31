n, k = map(int, input().split())

circle = [ i+1 for i in range(n)]

# 제거되었는지 판달할 것임 -1은 제거가 안되었다는 것
check = [-1] * n
yos = [k]

check[k-1] = 0
i = k-1

while len(yos) < n :

    for _ in range(k) :
        # 아직 제거 되지 않은 사람이라면
        if check[i+1] == -1 :
            i += 1
            if i >= n-1 :
                i -= n-1
        else :
            while check[i+1] == 0 :
                i += 1
                if i >= n-1:
                    i -= n-1


    yos.append(circle[i])
    check[i] = 0


'''
        if check[i+1] == -1 :
            i += 1
        else :
            i += 2
            '''









print(yos)