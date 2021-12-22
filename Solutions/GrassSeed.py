cost = float(input())
lines = int(input())
land = 0.0
for i in range(lines):
    line = input().split(" ")
    land = land + float(line[0])*float(line[1])
print(land*cost)