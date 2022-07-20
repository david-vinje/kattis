t = int(input())
for _ in range(t):
  lst = input().split(" ")
  total = int(lst[0])
  diff = 0
  for i in range(1, len(lst)-1):
    add = int(lst[i])
    diff += max(add-total*2, 0)
    total = add
  print(diff)
