#include <stdlib.h>
#include <stdio.h>
struct list {
	char* data;
	struct list* next;
};
typedef struct list* List;

void main() {
	List newlist = malloc(sizeof(struct list));
	newlist->data = "List ";
	newlist->next = malloc(sizeof(struct list));
	newlist->next->data = "test\n";
	while (newlist != NULL){
		printf(newlist->data);
		newlist=newlist->next;
	}
}
