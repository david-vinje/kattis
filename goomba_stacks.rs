use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: usize = n.trim().parse().unwrap();
    let mut g = 0;
    // let (mut g, mut b) = (0, 0);
    for _ in 0..n {
        let mut line = String::new();
        io::stdin().read_line(&mut line).unwrap();
        let line: Vec<_> = line.split_whitespace().map(|x| x.parse::<usize>().unwrap()).collect();
        g += line[0];
        // b += line[1];
        if line[1] > g {
            println!("impossible");
            return;
        }
    }
    println!("possible");
}
