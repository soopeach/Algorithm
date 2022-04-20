k = int(input())

graph =[]
for _ in range(k) :
    n = int(input())
    if n == 0 :
        del graph[-1]
    else :
        graph.append(n)

print(sum(graph))

