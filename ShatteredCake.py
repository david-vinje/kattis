w = int(input())
n = int(input())
area = 0
for _ in range(n):
  a, b = [int(x) for x in input().split()]
  area += a*b
print(int(area/w))