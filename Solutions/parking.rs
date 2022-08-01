fn main() {
    let mut t = String::new();
    std::io::stdin().read_line(&mut t).expect("msg");
    let t: i32 = t.trim().parse().expect("msg");
    for _ in 0..t {
        let mut n = String::new();
        std::io::stdin().read_line(&mut n).expect("msg");
        let mut n = String::new();
        std::io::stdin().read_line(&mut n).expect("msg");
        let n: Vec<i32> = n.split(" ").map(|x| x.trim().parse().unwrap()).collect();
        let max = n.iter().max().unwrap();
        let min = n.iter().min().unwrap();
        println!("{}", max*2 - min*2);
    }
}
