use std::io;

fn main() {
    let mut dna = String::new();
    io::stdin().read_line(&mut dna).unwrap();
    let dna = dna.trim().contains("COV");
    println!("{}", if dna { "Veikur!" } else { "Ekki veikur!" })
}