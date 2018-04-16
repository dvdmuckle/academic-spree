package main

import "fmt"

type list struct {
	next *list
	data string
}

func main() {
	newList := new(list)
	newList.data = "List "
	newList.next = new(list)
	newList.next.data = "test\n"
	for ; newList != nil; newList = newList.next {
		fmt.Printf(newList.data)
	}
}
