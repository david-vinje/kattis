#!/usr/bin/env ruby
n = gets.chomp.to_i
s = gets.chomp.split(/ /).map(&:to_i)
sum = 0
s.each do |val|
  sum += val
end
puts " #{sum}"
