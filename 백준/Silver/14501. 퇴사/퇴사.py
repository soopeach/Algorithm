n = int(input())
t, p = [], []
d = [0] * 16

for _ in range(n):
    input_data = input().split()
    t.append(int(input_data[0]))
    p.append(int(input_data[1]))


for i in range(n-1, -1, -1) :

    if t[i] + i > n:
        d[i] = d[i+1]
    else :
        d[i] = max(d[i+1], p[i]+ d[i+ t[i]])


print(d[0])