#include "stdio.h"
#include "math.h"

int main()
{
    int n, w, h;
    scanf("%d%d%d", &n, &w, &h);
    int max = (int)sqrt(w * w + h * h);
    int d;
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &d);
        if (d <= max)
        {
            puts("DA");
        }
        else
        {
            puts("NE");
        }
    }
    return 0;
}