use std::io;

fn main() {
    let mut line: String = String::new();

    io::stdin().read_line(&mut line).expect("err");

    let nums:Vec<f64> = line.split_whitespace()
        .map(|x| x.parse().unwrap()).collect();

    if nums[0] + nums[1] == nums[2] {
        println!("correct!")
    } else {
        println!("wrong!")
    }

}
