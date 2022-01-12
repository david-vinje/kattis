L = int(input())
D = int(input())
X = int(input())

N = L
while (True):
    sum = 0
    for n in map(int, str(N)):
        sum = sum+n
    if (sum == X):
        break
    N = N+1
    
M = D
while (True):
    sum = 0
    for m in map(int, str(M)):
        sum = sum+m
    if (sum == X):
        break
    M = M-1

print(N)
print(M)