#include<stdio.h>

int main() {
  int n;
  scanf("%d", &n);
  n = n/1000000 % 10 == 5 && n/100000 % 10 == 5 && n/10000 % 10 == 5 ? 1 : 0;
  printf("%d\n", n);
}