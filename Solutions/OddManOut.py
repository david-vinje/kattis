n = int(input())
for i in range(n):
    odd_man = []
    g = int(input())
    cs = input().split(" ")
    for c in cs:
        c = int(c)
        if c in odd_man:
            odd_man.remove(c)
        else:
            odd_man.append(c)
    print("Case #%d: %d" % (i+1, odd_man.pop()))
    
