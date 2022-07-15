s, t, n = [int(x) for x in input().split(' ')]
ds = [int(x) for x in input().split(' ')]
bs = [int(x) for x in input().split(' ')]
cs = [int(x) for x in input().split(' ')]
sum = ds[0]
for i in range(n):
  sum += (cs[i] - sum%cs[i])%cs[i] + bs[i] + ds[i+1]
print(sum)
