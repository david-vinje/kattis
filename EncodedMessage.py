import math

n = int(input())
for _ in range(n):
  line = input()
  k = int(math.sqrt(len(line)))
  chunks = [line[i:i+k] for i in range(0, len(line), k)]
  s = ""
  for j in reversed(range(k)):
    for chunk in chunks:
      s += chunk[j]
  print(s)