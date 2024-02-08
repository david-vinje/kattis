n = int(input())
s = list(input())
coffee, count = 0, 0
for l in s:
    if l == '1':
        coffee = 2
        count += 1
    elif coffee > 0:
        count += 1
        coffee -= 1
print(count)