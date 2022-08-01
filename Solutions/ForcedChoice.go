package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	var n, p, s int
	fmt.Scanf("%d%d%d", &n, &p, &s)
	in := bufio.NewReader(os.Stdin)
	for i := 0; i < s; i++ {
		line, _ := in.ReadString('\n')
		line = line[2:strings.Index(line, "\n")]
		arr := strings.Split(line, " ")
		keep := false
		for _, a := range arr {
			i, _ := strconv.Atoi(a)
			if p == i {
				keep = true
				break
			}
		}
		if keep {
			fmt.Println("KEEP")
		} else {
			fmt.Println("REMOVE")
		}
	}
}
