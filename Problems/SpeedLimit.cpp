#include <iostream>

using namespace std;

int main() {
    int k; cin >> k;
    while (k != -1) {
        int sum = 0, miles = 0, hours = 0, tmp = 0;
        for (int i=0; i<k; i++) {
            cin >> miles;
            cin >> hours;
            sum += miles * (hours - tmp);
            tmp = hours;
        }
        cin >> k;
        printf("%d miles\n", sum);
    }
}