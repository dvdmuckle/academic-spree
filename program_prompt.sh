#!/bin/bash
clear
trap 'exit 1' 2 20
echo "Please select a program to execute"
echo "[1]: Echo input"
echo "[2]: Sum two numbers"
echo "[3]: Compare inputs"
echo "[4]: Linked list"
echo "[5]: Fibonacci number"
read -e -p "Enter a number 1 through 5 to select a program: " prog_number
while [[ "$prog_number" != [1-5] ]]; do
	read -e -p "Enter a number 1 through 5 to select a program: " prog_number
done
echo "Please select a language"
echo "[1]: BASIC"
echo "[2]: Lisp"
echo "[3]: C"
echo "[4]: Java"
echo "[5]: Go"
read -e -p "Enter a number 1 through 5 to select a program: " prog_lang
while [[ "$prog_lang" != [1-5] ]]; do
	read -e -p "Enter a number 1 through 5 to select a program: " prog_lang
done
declare -A langs=( ["1"]="basic" ["2"]="scheme" ["3"]="c" ["4"]="java" ["5"]="go")
declare -A progs=( ["1"]="echo" ["2"]="sum" ["3"]="compare" ["4"]="list" ["5"]="fib")
./"${langs[$prog_lang]}".sh "${progs[$prog_number]}"
sleep 15
bash program_prompt.sh
