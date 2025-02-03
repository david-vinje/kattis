open System
[<EntryPoint>]
let main argv =
    let input = Console.ReadLine() |> Seq.toList
    let total = List.length input |> float
    let computeRatio = (fun x -> x/total)
    let isLowerLetter = (fun (x:char) -> int x>96 && int x<123)
    let isUpperLetter = (fun (x:char) -> int x>64 && int x<91)

    input |> List.filter (fun x -> x = '_') |> List.length |> float |> computeRatio |> printfn "%f" 
    input |> List.filter (fun x -> isLowerLetter x) |> List.length |> float |> computeRatio |> printfn "%f" 
    input |> List.filter (fun x -> isUpperLetter x) |> List.length |> float |> computeRatio |> printfn "%f" 
    input |> List.filter (fun x -> x <> '_' && not (isUpperLetter x) && not (isLowerLetter x)) |> List.length |> float |> computeRatio |> printfn "%f"
    0