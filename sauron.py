line = input()
count = 0
countdown = False
for char in line:
  if char == ')':
    countdown = True
  count += 1 if countdown else -1 
if count == 0:
  print('correct')
else:
  print('fix')
    