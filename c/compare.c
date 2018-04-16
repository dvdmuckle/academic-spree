#include <stdlib.h>
#include <stdio.h>
#include <string.h>
void main() {
	char x[256];
	char y[256];
	fgets(x, 256, stdin);
	fgets(y, 256, stdin);
	if(strcmp(x, y) == 0) {
		printf("Same input\n");
	} else {
		printf("Not the same input\n");
	}
}
