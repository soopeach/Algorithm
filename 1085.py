# x, y는 각각 현재있는  x와 y 위치의 좌표, w,h는 직사각형의 끝의 좌표
# w는 직사각형의 가로 h는 직사각형의 세로
x, y, w, h = map(int, input().split())

result = min(abs(w-x), abs(0-x), abs(h-y), abs(0-y))

print(result)
