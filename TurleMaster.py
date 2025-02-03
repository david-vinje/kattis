board = []
for _ in range(8):
  board.append(list(input()))
  
x, y, d = 0, 7, 1
instructions = list(input())

def forwards():
  if d == 0:
    return x, y-1
  elif d == 1:
    return x+1, y
  elif d == 2:
    return x, y+1
  else:
    return x-1, y


for i in instructions:
  if i == 'F':
    x, y = forwards()
    if (x == -1 or y == -1 or x == 9 or y == 9
        or board[y][x] == 'C' or board[y][x] == 'I'):
      print("Bug!")
      exit()
  elif i == 'R':
    d = (d+1)%4
  elif i == 'L':
    d = (d-1)%4
  else:
    a, b = forwards()
    if board[b][a] == 'I':
      board[b][a] = '.'
    else:
      print("Bug!")
      exit()
      
if board[y][x] == 'D':
  print("Diamond!")
else:
  print("Bug!")
    
    