use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: usize = n.trim().parse().unwrap();
    for _ in 0..n {  
        let (mut first, mut second) = (String::new(), String::new());
        io::stdin().read_line(&mut first).unwrap();
        io::stdin().read_line(&mut second).unwrap();
        let res: String = 
            first.trim().chars().zip(second.trim().chars())
            .map(|(a, b)| if a == b { '.' } else { '*' })
            .collect();
        println!("{}{}{}\n", first, second, res);
    }
}