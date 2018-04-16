#include <stdlib.h>
#include <stdio.h>
void main() {
	char in[256];
	fgets(in, 256, stdin);
	printf("You said %s\n", in);
}
