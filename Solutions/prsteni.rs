use std::{cmp, io};

fn gcd(a: i32, b: i32) -> i32 {
    let mut res = cmp::min(a, b);
    while res > 0 {
        if a % res == 0 && b % res == 0 {
            return res;
        }
        res -= 1;
    }
    return res;
}

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).expect("msg");
    let _n: i32 = n.trim().parse().expect("msg");

    let mut rings = String::new();
    io::stdin().read_line(&mut rings).expect("msg");
    let rings: Vec<i32> = rings
        .split_whitespace()
        .map(|ring| ring.trim().parse().unwrap())
        .collect();

    for (_i, &item) in rings[1..].iter().enumerate() {
        let lcm = rings[0] * item / gcd(rings[0], item);
        let nom = (lcm / item).to_string();
        let denom = (lcm / rings[0]).to_string();
        let res = String::from(nom + "/" + &denom);
        println!("{}", res);
    }
}
