class Guest:
  def __init__(self, name, score):
    self.name = name
    self.score = score

n = int(input())
best_guest = Guest("", 0)

for _ in range(n):
  name, value = input().split()
  value = int(value)
  if best_guest.score < value:
    best_guest.name = name
    best_guest.score = value

print(best_guest.name)