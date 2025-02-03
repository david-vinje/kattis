let r, c = 
  // "4 4"
  System.Console.ReadLine()
  |> (fun s -> s.Split(" "))
  |> Array.map int
  |> (fun a -> a.[0], a.[1])

let rec buildMap n =
  match n with
  | 0 -> []
  | _ -> System.Console.ReadLine() :: buildMap (n-1)

let map = 
  buildMap r
  |> List.map (fun (s: string) -> s.ToCharArray()) 
  |> List.map Array.pairwise

map |> List.pairwise