#include <iostream>
using namespace std;

void join(int S, int P, int *A, int *rank)
{
    if (rank[S] > rank[P])
    {
        A[P] = S;
        rank[S] += rank[P];
    }
    else
    {
        A[S] = P;
        rank[P] += rank[S];
    }
}

int find(int p, int *A)
{
    while (p != A[p])
    {
        A[p] = A[A[p]];
        p = A[p];
    }
    return p;
}

int main()
{
    int n, q, a, b, A, B;
    char c;
    cin >> n >> q;
    int id[n + 1], rank[n + 1];
    for (int i = 0; i <= n; i++)
    {
        id[i] = i;
        rank[i] = 1;
    }
    for (int i = 0; i < q; i++)
    {
        cin >> c >> a;
        A = find(a, id);
        if (c == 't')
        {
            cin >> b;
            B = find(b, id);
            if (A != B)
            {
                join(A, B, id, rank);
                        }
        }
        else
        {
            cout << rank[A] << "\n";
        }
    }
}