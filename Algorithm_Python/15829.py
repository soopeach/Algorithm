# mod 는 찾아보고 블로그 글에 첨부할 것(나머지 연산)

l = int(input())
str = input()
mod = 1234567891
hash = 0
# 아스키 코드에서 96을 빼주면 됨

for i in range(l):
     cur = ord(str[i]) - 96
     hash += cur * 31 ** i

print(hash % mod)

