use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: f64 = n.trim().parse().unwrap();
    println!("{}", n * 0.09144)
}