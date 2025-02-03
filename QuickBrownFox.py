k = int(input())
ab = "qwertyuiopasdfghjklzxcvbnm"
for k in range(k):
    chars = set()
    line = input().lower()
    for c in ab:
        if c not in line:
            chars.add(c)
    if len(chars) > 0:
        line = ""
        for c in chars:
            line += c
        print("missing", "".join(sorted(line)))
    else:
        print("pangram")