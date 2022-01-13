xs = []
ys = []
for _ in range(0,3):
    line = input().split(" ")
    x = int(line[0])
    y = int(line[1])
    if x not in xs:
        xs.append(x)
    else:
        xs.remove(x)
    if y not in ys:
        ys.append(y)
    else:
        ys.remove(y)
print(xs[0], ys[0])
