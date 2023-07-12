use std::io;

fn main() {
    let mut line = String::new();
    io::stdin().read_line(&mut line).expect("msg");
    let n: f32 = line.trim().parse().unwrap();
    println!("{:.2}", n/4.0);
}