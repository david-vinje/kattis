#include <iostream>
#include <unordered_map>
using namespace std;

void update(string f, unordered_map<string, string> &map, unordered_map<string, int> &size)
{
    if (map.find(f) == map.end())
    {
        map[f] = f;
        size[f] = 1;
    }
}

string find(string f, unordered_map<string, string> &map)
{
    while (f != map[f])
    {
        map[f] = map[map[f]];
        f = map[f];
    }
    return f;
}

void join(string F1, string F2, unordered_map<string, string> &map, unordered_map<string, int> &size)
{
    if (size[F1] < size[F2])
    {
        size[F2] += size[F1];
        map[F1] = F2;
    }
    else
    {
        size[F1] += size[F2];
        map[F2] = F1;
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int n, k;
    cin >> n;
    string f1, f2, F1, F2;
    for (int i = 0; i < n; i++)
    {
        cin >> k;
        unordered_map<string, int> size;
        unordered_map<string, string> map;
        for (int j = 0; j < k; j++)
        {
            cin >> f1 >> f2;
            update(f1, map, size);
            update(f2, map, size);
            F1 = find(f1, map);
            F2 = find(f2, map);
            if (F1 != F2)
            {
                join(F1, F2, map, size);
            }
            int m = max(size[F1], size[F2]);
            cout << m << "\n";
        }
    }
}