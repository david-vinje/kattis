n, m, k = [int(x) for x in input().split(" ")]
# books_owned = dict()
books = dict()
time = 0
for _ in range(n):
    line = input().split(" ")
    key = " ".join(line[0:-1])
    value = int(line[-1])
    if key < '"Jane Eyre"':
        # books_owned[key] = value
        books[key] = value
        time += value
new_books = dict()
new_books_time = dict()
for _ in range(m):
    line = input().split(" ")
    key = " ".join(line[1:-1])
    value = int(line[-1])
    if key < '"Jane Eyre"':
        if int(line[0]) <= time:
            books[key] = value
            time += value
        else:   
            new_books[key] = value
            new_books_time[key] = int(line[0])
book_added = True
while book_added:
    time_copy = new_books_time.copy()
    books_copy = new_books.copy()
    book_added = False
    for key in books_copy.keys():
        if time_copy[key] <= time:
            book_added = True
            time += books_copy[key]
            del new_books_time[key]
            del new_books[key]
print(time+k)
    