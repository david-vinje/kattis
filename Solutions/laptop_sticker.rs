use std::io::stdin;

fn main() {
  let mut dims = String::new();
  stdin().read_line(&mut dims).expect("msg");
  let dims: Vec<i32> = dims.split(" ").map(|x| x.trim().parse().unwrap()).collect();
  if dims[0] > dims[2]+1 && dims[1] > dims[3]+1 {
    println!("1");
  } else {
    println!("0");
  }
}