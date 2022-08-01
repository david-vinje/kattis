package main

import (
	"fmt"
	"math"
)

func main() {
	var s1, s2, s3, s4 float64
	fmt.Scanf("%f%f%f%f", &s1, &s2, &s3, &s4)
	var s float64 = (s1 + s2 + s3 + s4) / 2
	fmt.Println(math.Sqrt((s - s1) * (s - s2) * (s - s3) * (s - s4)))
}
