t = int(input())

for _ in range(t) :

    # n은 문서의 개수
    # m은 몇 번째로 인쇄되었는지 궁금한 문서
    n, m = map(int, input().split())

    # doc은 n개의 문서가 중요도 순으로 주어짐
    doc = list(map(int, input().split()))

print(doc)