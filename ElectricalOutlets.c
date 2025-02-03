#include<stdio.h>

int main() {
  int n, k, o;
  scanf("%d", &n);
  while (n--) {
    scanf("%d", &k);
    int res = 1;
    while (k--) {
      scanf("%d", &o);
      res += o-1;
    }
    printf("%d\n", res);
  }
}