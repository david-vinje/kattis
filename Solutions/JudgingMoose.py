line = input().split(" ")
n1 = int(line[0])
n2 = int(line[1])
m = max(n1, n2)
if m == 0:
    print("Not a moose")
elif n1 == n2:
    print("Even", 2*m)
else:
    print("Odd", 2*m)