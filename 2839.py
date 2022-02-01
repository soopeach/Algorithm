n = int(input())

d = [0] * 5001

for i in range(3,n+1) :

    d[i] = d[i-1] + 1

    if i % 3 == 0 :
        d[i] = min(d[i//3]+1, d[i])
    if i % 5 == 0 :
        d[i] == min(d[i//5]+1, d[i])


print(d[n])
