while True :
    test = []
    rem = []
    sen = input()

    if sen == ".":
        quit()
    for check in sen :
        if check == "(" or check == ")" or check == "[" or check == "]" :
            test.append(check)

    for i in range(len(test)-1):
        if test[i] == "(" and test[i+1] ==")":
            rem.append(i)
            rem.append(i+1)
        if test[i] == "[" and test[i+1] =="]":
            rem.append(i)
            rem.append(i + 1)


    if test:
        print("yes")
    else :
        print("no")
