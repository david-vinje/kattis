#include <stdio.h>
#include <math.h>

int main() {
    int a, b, c;
    char s[4];
    scanf("%d%d%d", &a, &b, &c);
    scanf("%s", s);
    int min = a*(a<b && a<c) + b*(b<c && b<a) + c*(c<a && c<b);
    int max = a*(a>b && a>c) + b*(b>c && b>a) + c*(c>a && c>b);
    int mid = a*(a!=max && a!=min) + b*(b!=max && b!=min) + c*(c!=max && c!=min);
    for (int i=0; i<3; i++) {
        if (s[i] == 'A') {
            printf("%d ", min);
        } else if (s[i] == 'B') {
            printf("%d ", mid);
        } else {
            printf("%d ", max);
        }
    }
    printf("\n");
}