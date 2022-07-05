#include<stdio.h>
#include<string.h>

int main() {
  char buffer[1000];
  scanf("%s", buffer);
  char * ptr;
  int    ch = 'a';
  ptr = strchr( buffer, ch );
  printf("%s\n", ptr);
}