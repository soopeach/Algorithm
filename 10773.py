k = int(input())

graph =[]
for _ in range(k) :
    input_data = int(input())
    if input_data == 0 :
        del graph[-1]
    else :
        graph.append(input_data)

print(sum(graph))

