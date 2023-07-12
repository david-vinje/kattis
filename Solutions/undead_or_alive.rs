use std::io;

fn main() {
    let mut line = String::new();
    io::stdin().read_line(&mut line).expect("msg");
    let (mut undead, mut alive) = (false, false);
    let chars: Vec<_> = line.chars().collect();
    for (i, c) in line.chars().enumerate() {
        if c == ':' {
            if chars[i+1] == ')' {
                alive = true;
            }
            if chars[i+1] == '(' {
                undead = true;
            }
        }
    }
    let res = if undead && alive {"double agent"} else if undead {"undead"} else if alive {"alive"} else {"machine"};
    println!("{}", res)
}
