n = int(input())
lst = input().split(" ")
d = dict()
m = n
for i, a in enumerate(lst):
  if (a in d.keys()):
    m = min(m, i-d[a])
  d[a] = i
print(m)