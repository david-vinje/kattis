#include<iostream>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    long long k;
    cin >> k;
    while (k--)
    {
        long long p, r, f;
        cin >> p >> r >> f;
        long long count = 0;
        while (p <= f) {
            p *= r;
            count++;
        }
        cout << count << "\n";
    }
    
}