#include <stdlib.h>
#include <stdio.h>
#include <string.h>
void main() {
	char inX[256];
	char inY[256];
	fgets(inX, 256, stdin);
	fgets(inY, 256, stdin);
	int x = atoi(inX);
	int y = atoi(inY); 
	printf("%d\n", (x + y));
}
