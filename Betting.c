#include <stdio.h>

int main(void) {
  float a;
  scanf("%f", &a);
  printf("%f\n%f\n", 100/a, 100/(100-a));
}