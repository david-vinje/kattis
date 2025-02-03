#include<stdio.h>

int main() {
  int n, k;
  scanf("%d", &n);
  while (n--)
  {
    scanf("%d", &k);
    printf("%d ", k);
    scanf("%d", &k);
    printf("%d\n", ((k+3)*k)/2);
  }
}