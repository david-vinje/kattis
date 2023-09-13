
use std::io::{self, BufRead, Write};
fn main() {
    let mut reader = io::BufReader::new(io::stdin());
    let mut writer = io::BufWriter::new(io::stdout());
    let mut n = String::new();
    let _ = reader.read_line(&mut n);
    let n: i32 = n.trim().parse().unwrap();
    for _ in 0..n {
        let mut line = String::new();
        let _ = reader.read_line(&mut line);
        let line: Vec<f32> = line.trim().split_whitespace().map(|x| x.parse().unwrap()).collect();
        let (a, b, c) = (line[0], line[1], line[2]);
        let res = a + b == c
            || a * b == c
            || a - b == c
            || b - a == c
            || a / b == c
            || b / a == c;
        if res { let _ = writer.write(b"Possible\n"); } else { let _ = writer.write(b"Impossible\n"); }
    }
}
