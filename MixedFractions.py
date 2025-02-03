line = input().split(" ")
k = int(line[0])
n = int(line[1])
while not (n == 0 and k == 0):
    print(int(k/n), k%n, "/", n)
    line = input().split(" ")
    k = int(line[0])
    n = int(line[1])