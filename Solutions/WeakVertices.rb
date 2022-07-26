#!/usr/bin/ruby
while true
  n = gets.chomp.to_i
  if n == -1
    break
  end
  graph = []
  weakVertices = ""
  for _ in 0..n-1
    graph.append(gets.chomp.split(/ /).map(&:to_i))
  end
  for i in 0..n-1
    neighbors = []
    for j in 0..n-1
      if graph[i][j] == 1 
        neighbors.append(j)
      end
    end
    isFigured = false
    for j in 0..neighbors.size()-1 
      for k in j+1..neighbors.size()-1
        if graph[neighbors[j]][neighbors[k]] == 1
          isFigured = true
          break
        end
      end
      if isFigured
        break
      end
    end
    if !isFigured
      weakVertices += + "#{i} "
    end
  end
  puts "#{weakVertices}"
end