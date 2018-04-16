package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func fibonacci(n int, a int, b int) int {
	if n == 0 {
		return a
	} else if n == 1 {
		return b
	} else {
		return fibonacci((n - 1), b, (a + b))
	}
}

func fib(n int) int {
	return fibonacci(n, 0, 1)
}

func main() {
	reader := bufio.NewReader(os.Stdin)
	in, _ := reader.ReadString('\n')
	in = strings.Replace(in, "\n", "", 1)
	inInt, _ := strconv.Atoi(in)
	fmt.Println(fib(inInt))
}
