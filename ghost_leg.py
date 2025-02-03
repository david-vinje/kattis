n, m = [int(x) for x in input().split()]
rungs = []

for _ in range(m):
    a = int(input())
    rungs.append((a, a+1))

elems = {}
for elem in range(1, n+1):
    elems[elem] = elem

for elem in range(1, n+1):
    count = 0
    while count < m:
        a, b = rungs[count]
        if a == elems[elem]:
            elems[elem] = b
        elif b == elems[elem]:
            elems[elem] = a
        count += 1

elems = {k: v for k, v in sorted(elems.items(), key=lambda item: item[1])}

for k, v in elems.items():
    print(k)