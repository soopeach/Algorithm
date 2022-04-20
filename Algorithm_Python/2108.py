n = int(input())
list = []
sum = 0
mos = 0

for _ in range(n):
    list.append(int(input()))

# 1. 산술평균을 구하는 과정
for i in list:
    sum += i

arithmetic_mean = round(sum / n)
print(arithmetic_mean)

# 2. 중앙값을 구하는 과정
middle = sorted(list)
print(middle[n//2])

# 3. 최빈값을 구하는 과정
cnt = [0 for _ in range(8001)]

'''
-4000이면 0
0 이면 4000
1이면 4001

-1부터 -4000은 
0부터 3999 
0은 4000
1부터 4000까지는 
4001 부터 8000'''

for i in list :
    cnt[4000+i] += 1

cnt.sort()
for i in cnt :
    if cnt.index(max(cnt)) == i :
        mos += 1
        ans = i
        if mos == 2 :
            print(ans)
            break

print(cnt.index(max(cnt)) - 4000)


# 4. 범위를 구하는 과정
print(max(list)-min(list))
