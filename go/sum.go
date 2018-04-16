package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	xIn, _ := reader.ReadString('\n')
	xIn = strings.Replace(xIn, "\n", "", 1)
	yIn, _ := reader.ReadString('\n')
	yIn = strings.Replace(yIn, "\n", "", 1)
	x, _ := strconv.Atoi(xIn)
	y, _ := strconv.Atoi(yIn)
	sum := x + y
	fmt.Println(sum)
}
