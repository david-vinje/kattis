Seq.initInfinite int
|> Seq.take 100
|> Seq.map (fun i -> i+1)
|> Seq.iter (fun i -> 
  if i%3 = 0 && i%5 = 0 then printfn "FizzBuzz"
  elif i%3 = 0 then printfn "Fizz"
  elif i%5 = 0 then printfn "Buzz"
  else printfn "%d" i)