k = int(input())
line = input().split(" ")
res = 0
for i in range(0, k):
    n = int(line[i])
    if n == -1:
        k = k-1
    else:
        res = res+n
print(res/k)