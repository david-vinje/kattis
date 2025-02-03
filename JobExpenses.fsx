[<EntryPoint>]
let main argv =
  let n = System.Console.ReadLine() |> int
  if n = 0 then 
    printfn "%d" 0
  else
    System.Console.ReadLine()
    |> (fun s -> s.Split " ")
    |> Array.map int
    |> Array.fold (fun acc i -> if i < 0 then acc-i else acc) 0
    |> (fun i -> printfn "%d" i)
  0