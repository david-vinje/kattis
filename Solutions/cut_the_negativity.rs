use std::io::{self, BufReader, BufWriter, BufRead, Write};

fn main () {
    let mut reader = BufReader::new(io::stdin());
    let mut writer = BufWriter::new(io::stdout());
    let mut m = String::new();
    reader.read_line(&mut m).expect("msg");
    let n = m.trim().parse().unwrap();
    let mut m = 0;
    let mut ans = vec![];
    for i in 1..=n {
        let mut line = String::new();
        reader.read_line(&mut line).expect("msg");
        let line: Vec<i32> = line.split_whitespace().map(|x| x.parse().unwrap()).collect();
        for j in 1..=n {
            let c = line[j-1];
            if c == -1 { continue; }
            ans.push(format!("{} {} {}", i, j, c));
            m += 1;
        }
    }
    let _ = writeln!(writer, "{}", m);
    for line in ans {
        let _ = writeln!(writer, "{}", line);
    }
}