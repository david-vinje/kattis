fn main() {
    let mut x = String::new();
    std::io::stdin().read_line(&mut x).expect("msg");
    let mut x: f32 = x.trim().parse().expect("asd");
    x *= 5280.0/4854.0*1000.0;
    println!("{}", x.round());
}
