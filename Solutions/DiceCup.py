import math

line = input().split(" ")
a = int(line[0])
b = int(line[1])

d = dict()
for i in range(1,b+1):
    for j in range(1,a+1):
        d[i+j] = 0

max = 0
for i in range(1,b+1):
    for j in range(1,a+1):
        d[i+j] = d[i+j]+1
        if d[i+j] > max:
            max = d[i+j]
            
for i in range(2,b+a):
        if (d[i] == max):
            print(i)