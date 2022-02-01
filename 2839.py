n = int(input())

d = [0] * 5001
d[3] = 1
for i in range(4,n+1) :

    if i % 3 == 0 :
        d[i] = (d[i//3] + 1)
    if i % 5 == 0 :
        d[i] = d[i//5] + 1


    if i % 5 == 0 and i % 3 == 0 :
        d[i] = min(d[i//5]+1, d[i//3]+1)
    if i % 3 != 0 and i % 5 != 0 :
        d[i] = -1


print(d[n])
