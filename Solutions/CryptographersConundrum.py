word = input()
new_word = "PER"*len(word)
count = 0
for l1, l2 in zip(word, new_word):
    if not l1 == l2:
        count = count+1
print(count)