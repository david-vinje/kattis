n, h, v = [int(i) for i in input().split()]
print(max(h,n-h) * max(v,n-v) * 4)