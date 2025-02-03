from queue import PriorityQueue

n, lukketid = [int(x) for x in input().split()]

PQ = PriorityQueue()

for _ in range(n):
  b, d = [int(x) for x in input().split()]
  PQ.put((b, d))
  
tid, interval = PQ.get()

count = 1

while tid < lukketid:
  exit = tid + interval
  entrance, next_interval = PQ.get()
  if entrance < exit:
    count += 1
  entrance += next_interval
  PQ.put((entrance, next_interval))
  

print(count)