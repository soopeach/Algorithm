import sys
# 명령의 수(n)
n = int(sys.stdin.readline().rstrip())
deque = []

for _ in range(n):

    command = sys.stdin.readline().rstrip().split()

    # push_front
    if command[0] == "push_front":
        deque.insert(0, int(command[1]))

    # push_back
    elif command[0] == "push_back":
        deque.append(int(command[1]))

    # pop_front
    elif command[0] == "pop_front":
        if deque :
            print(deque[0])
            del deque[0]
        else :
            print("-1")

    # pop_back
    elif command[0] == "pop_back":
        if deque:
            print(deque[-1])
            del deque[-1]
        else :
            print("-1")

    # size
    elif command[0] == "size" :
        print(len(deque))

    # empty
    elif command[0] == "empty" :
        if deque :
            print("0")
        else :
            print("1")

    # front
    elif command[0] == "front" :
        if deque :
            print(deque[0])
        else :
            print("-1")

    # back
    elif command[0] == "back" :
        if deque :
            print(deque[-1])
        else :
            print("-1")