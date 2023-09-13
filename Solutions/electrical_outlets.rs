use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let mut n: usize = n.trim().parse().unwrap();
    while n > 0 {
        n -= 1;
        let mut line = String::new();
        io::stdin().read_line(&mut line).unwrap();
        let res: Vec<_> = line.split_whitespace().collect();
        let res = &res[1..].iter()
            .map(|x| x.parse::<i32>().unwrap())
            .fold(1, |acc, x| acc + x - 1);
        println!("{}", res)
    }
}