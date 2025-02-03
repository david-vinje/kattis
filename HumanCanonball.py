import math

n = int(input())
for _ in range(n):
  v0, theta, x1, h1, h2 = [float(x) for x in input().split(" ")]
  theta = theta/180*math.pi
  t = x1/(math.cos(theta)*v0)
  y = v0*t*math.sin(theta) - 9.81*t*t/2
  if y <= h2-1 and y >= h1+1:
    print("Safe")
  else:
    print("Not Safe")