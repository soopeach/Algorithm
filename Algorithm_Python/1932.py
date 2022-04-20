n = int(input())

tri=[[0] * (n+1) for _ in range(n+1)]

for i in range(1, n+1) :

    input_data = input().split()

    for j in range(0, len(input_data)):
        tri[i][j+1] = int(input_data[j])

if n >= 2 :
    tri[2][1] += tri[1][1]
    tri[2][2] += tri[1][1]

if n >= 3 :
    for i in range(3, n + 1):

        for j in range(1, i + 1):

            if j == 1 or j == i + 1:
                tri[i][j] += tri[i - 1][j]
            else:
                tri[i][j] += max(tri[i - 1][j - 1], tri[i - 1][j])

print(max(tri[n]))