#include <stdlib.h>
#include <stdio.h>
#include <string.h>
int fibonacci(int n, int a, int b) {
	if (n == 0)
		return a;
	else if (n == 1)
		return b;
	else
		return fibonacci((n-1), b, (a + b));
}

void main() {
	char in[256];
	fgets(in, 256, stdin);
	int inInt = atoi(in);
	printf("%d\n", fibonacci(inInt, 0, 1));

}

