use std::io::stdin;

fn main() {
  let mut ints = String::new();
  stdin().read_line(&mut ints).expect("msg");
  let mut ints: Vec<i32> = ints.split(" ").map(|x| x.trim().parse().unwrap()).collect();
  ints.sort();
  println!("{}", ints[0] * ints[2]);
}
