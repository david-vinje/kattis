import math
line = input().split(" ")
a = int(line[0])
b = int(line[1])
v = math.sin(b*math.pi/180)
print(math.ceil(a/v))