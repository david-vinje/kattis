use std::io;

fn main() {
    let mut n = String::new();
    let mut m = String::new();
    io::stdin().read_line(&mut n).unwrap();
    io::stdin().read_line(&mut m).unwrap();
    let n: usize = n.trim().parse().unwrap();
    let m: usize = m.trim().parse().unwrap();
    println!("{}", n + m)
}