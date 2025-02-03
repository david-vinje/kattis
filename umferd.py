m = int(input())
n = int(input())
vacant = 0
for _ in range(n):
  line = list(input())
  for sign in line:
    if sign == '#':
      vacant += 1
total = m*n
print(1 - vacant / total)
    