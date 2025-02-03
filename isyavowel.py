vowels = list('aeiou')
count, y_count = 0, 0
for letter in list(input()):
  if letter in vowels:
    count += 1
  elif letter == 'y':
    y_count += 1
print(count, count+y_count)