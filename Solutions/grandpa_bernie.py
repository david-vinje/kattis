places = {}
n = int(input())

for _ in range(n):
    place, year = input().split()
    if place not in places:
        places[place] = []
    places[place].append(int(year))

for years in places.values():
    years.sort()

q = int(input())
for _ in range(q):
    place, pos = input().split()
    years = places[place]
    pos = int(pos)-1
    print(years[pos])