p, c = [int(x ) for x in input().split()]

import random

r = random.randint(1, 3)

if r == 1:
  print("yes")
if r == 2:
  print("no")
if r == 3:
  print("maybe")
