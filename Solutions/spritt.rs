use std::io;

fn main() {
    let mut line = String::new();
    io::stdin().read_line(&mut line).unwrap();
    let line: Vec<usize> = line.split_whitespace().map(|x| x.parse().unwrap()).collect();
    let mut sum: usize = 0;
    for _ in 0..line[0] {
        let mut a = String::new();
        io::stdin().read_line(&mut a).unwrap();
        sum += a.trim().parse::<usize>().unwrap();
    }
    println!("{}", if sum > line[1] { "Neibb" } else { "Jebb" })
}