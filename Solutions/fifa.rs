use std::io;

fn main() {
    let mut n = String::new();
    let mut k = String::new();
    io::stdin().read_line(&mut n).unwrap();
    io::stdin().read_line(&mut k).unwrap();
    let n: usize = n.trim().parse().unwrap();
    let k: usize = k.trim().parse().unwrap();
    let res = 2022 + n/k;
    println!("{}", res)
}