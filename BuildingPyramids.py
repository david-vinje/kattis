n = int(input())
count = 0
squares = 1
while n > -1:
  n -= squares*squares
  squares += 2
  count += 1
print(count-1)