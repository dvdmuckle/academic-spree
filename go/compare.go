package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

func main() {
	reader := bufio.NewReader(os.Stdin)
	xIn, _ := reader.ReadString('\n')
	xIn = strings.Replace(xIn, "\n", "", 1)
	yIn, _ := reader.ReadString('\n')
	yIn = strings.Replace(yIn, "\n", "", 1)
	if xIn == yIn {
		fmt.Println("Inputs are the same")
	} else {
		fmt.Println("Inputs are not the same")
	}
}
