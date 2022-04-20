import sys
import math

# 낮에 올라갈 수 있는 a, 밤에 미끄러지는 b, 막대기 높이 v
a, b, v = map(int, sys.stdin.readline().rstrip().split())

days = (v-a) / (a-b) + 1

print(math.ceil(days))
