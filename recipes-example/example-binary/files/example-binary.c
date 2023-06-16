#include <stdio.h>
#include <foo.h>

int main(int argc, char** argv){
	printf( "example binary!\n");
	int value = libfoo_do_something();
	printf("value: %d\n", value);

	return 0;
}
