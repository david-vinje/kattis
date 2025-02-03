let months =
  [
    1, 1; 
    2, 4; 
    3, 4;
    4, 0; 
    5, 2; 
    6, 5;
    7, 0; 
    8, 3; 
    9, 6;
    10, 1; 
    11, 4; 
    12, 6
  ]
  |> Map.ofList;;

let days =
  [
    0, "Sunday";
    1, "Monday";
    2, "Tuesday";
    3, "Wednesday";
    4, "Thursday";
    5, "Friday";
    6, "Saturday"
  ]
  |> Map.ofList

let d, m = 
  System.Console.ReadLine().Split(" ")
  |> Array.map int
  |> (fun a -> a.[0], a.[1])

[<EntryPoint>]
let main argv =
  // Take the last two digits of the year.
  9
  // Divide by 4, discarding any fraction.
  |> (fun i -> i/4)
  // Add the day of the month.
  |> (+) d
  // Add the month's key value: JFM AMJ JAS OND 144 025 036 146
  |> (fun i ->
    let v = 
      match months.TryFind m with
      | Some(v) -> v
      | None -> 0
    i + v)
  // Add 0 for 1900's, 6 for 2000's, 4 for 1700's, 2 for 1800's; for other years, add or subtract multiples of 400.
  |> (+) 6
  // Add the last two digits of the year.
  |> (+) 8
  // Divide by 7 and take the remainder. 
  |> (fun i -> int (float i % 7.0))
  |> (fun i -> 
    match days.TryFind i with
    | Some(v) -> v
    | None -> "")
  |> (printfn "%s")
  0