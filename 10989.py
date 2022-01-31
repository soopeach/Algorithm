# 명령의 수(n)
n = int(input())

deque = []

for _ in range(n):

    command = input().split()

    if command == "push_front":
        x = int(input())
        deque.insert(0, x)
    elif command == "push_back":
        x = int(input())
        deque.append(x)
    elif command == "pop_front":
        if deque != "" :
            print(deque[0])
            del deque[0]
        else :
            print("-1")
    elif command == "pop_back":
        if deque != "":
            print(deque[-1])
            del deque[-1]
        else :
            print("-1")
    elif command == "size" :
        print(len(deque))
    elif command == "empty" :
        if deque != "":
            print("0")
        else :
            print("1")
    elif command == "front" :
        if deque != "":
            print(deque[0])
        else :
            print("-1")
    elif command == "back" :
        if deque != "":
            print(deque[-1])
        else :
            print("-1")