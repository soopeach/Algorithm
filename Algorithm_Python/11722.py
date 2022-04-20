a = int(input())

seq = list(map(int, input().split()))
seq.insert(0,0)

d = [0] * 1001

for i in range(1, len(seq)) :
    d[i] = 1
    for j in range(1, i) :

        if seq[i] < seq[j] :
            d[i] = max(d[j]+1,d[i])

print(max(d))