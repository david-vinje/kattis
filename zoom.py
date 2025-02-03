n, k = [int(x) for x in input().split()]
res = []
lst = [int(x) for x in input().split()]
for i in range(k-1, n, k):
    res.append(str(lst[i]))
print(' '.join(res))
