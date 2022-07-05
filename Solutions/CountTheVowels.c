#include<stdio.h>
#include<string.h>

int main() {
  char s[100];
  fgets (s, 100, stdin);
  int i = -1, count = 0;
  while (s[++i] != '\0') {
    count += s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U'
      || s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u';
  }
  printf("%d\n", count);
}