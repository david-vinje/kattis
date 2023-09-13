use std::io;

fn main() {
    let mut pokemon: String = String::new();
    io::stdin().read_line(&mut pokemon).expect("msg");
    let pokemon: Vec<_> = pokemon.trim().chars().collect();
    let mut ids = String::new();
    io::stdin().read_line(&mut ids).expect("msg");
    let ids = ids.trim();
    let mut IDs = Vec::new();
    for i in (0..ids.len()-2).step_by(3) {
        let s = &ids[i .. i+3];
        IDs.push(s.parse::<usize>().unwrap());
    }
    let mut res = String::new();
    for id in IDs {
        let c = pokemon[id - 1];
        res.push(c);
    }
    println!("{}", res);
}
