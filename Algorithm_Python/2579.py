n = int(input())

d = [0] * (n+1)
stairs = [0] * (n + 1)

for i in range(1, n + 1):
    stairs[i] = int(input())

d[1] = stairs[1]

if n >= 2 :
    d[2] = stairs[1] + stairs[2]

if n >= 3:
    d[3] = max(stairs[2]+stairs[3],stairs[1]+stairs[3])

for i in range(4, n + 1):
    d[i] = stairs[i] + max(d[i-3] + stairs[i-1], d[i-2])

print(d[n])
