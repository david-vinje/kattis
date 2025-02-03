open System
[<EntryPoint>]
let main argv =
    let n = Console.ReadLine() |> float
    printfn "%.2f" (n/4.0)
    0