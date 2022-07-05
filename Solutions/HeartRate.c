#include <stdio.h>

int main(void) {
  int n; 
  scanf("%d", &n);
  while(n--) {
    float a, b;
    scanf("%f%f", &a, &b);
    float p = 60*a/b;
    float t = 60/b;
    printf("%f %f %f\n", p-t, p, p+t);
  }
}