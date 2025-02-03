n = int(input())

s = " "
for _ in range(n):
  s += " H"
s += "\n "

for _ in range(n):
  s += " |"
s += "\nH"

for _ in range(n):
  s += "-C"
s += "-OH\n "

for _ in range(n):
  s += " |"
  
s += "\n "
for _ in range(n):
  s += " H"
  
print(s)