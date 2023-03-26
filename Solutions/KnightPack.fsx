open System
[<EntryPoint>]
let main argv =
    let n = Console.ReadLine() |> int
    let f n = 
        match n%2 = 0 with
        | false -> printfn "first"
        | true -> printfn "second"
    f n
    0