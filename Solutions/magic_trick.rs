use std::collections::HashSet;

fn main() {
    let mut s = String::new();
    std::io::stdin().read_line(&mut s).expect("msg");
    let chars: Vec<_> = s.chars().collect();
    let mut set: HashSet<char> = HashSet::new();
    for c in &chars {
        set.insert(*c);
    }
    if chars.len() == set.len() {
        println!("1");
    } else {
        println!("0")
    }
}
