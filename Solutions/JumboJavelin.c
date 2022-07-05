#include <stdio.h>

int main(void) {
  int n, a, sum = 0;
  scanf("%d", &n);
  for (int i=0; i<n; i++) {
    scanf("%d", &a);
    sum += a-1;
  }
  printf("%d\n", sum+1);
}