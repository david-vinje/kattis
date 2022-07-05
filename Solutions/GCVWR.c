#include<stdio.h>

int main() {
  int G, T, N, i;
  scanf("%d%d%d", &G, &T, &N);
  G = (G-T)*0.9;
  while(N--) {
    scanf("%d", &i);
    G = G-i;
  }
  printf("%d\n", G);
}