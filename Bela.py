dom = {
  "A": 11,
  "K": 4,
  "Q": 3,
  "J": 20,
  "T": 10,
  "9": 14,
  "8": 0,
  "7": 0
}

non_dom = {
  "A": 11,
  "K": 4,
  "Q": 3,
  "J": 2,
  "T": 10,
  "9": 0,
  "8": 0,
  "7": 0
}

line = input().split(" ")
n = int(line[0])
suit = line[1]
sum = 0
for _ in range(4*n):
  line = list(input())
  if line[1] == suit:
    sum += dom[line[0]]
  else:
    sum += non_dom[line[0]]
print(sum)