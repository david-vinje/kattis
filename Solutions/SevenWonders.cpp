#include <iostream>
#include <vector>
#include <cmath>
using namespace std;

int main() {
    string str;
    cin >> str;
    int sum = 0;
    vector<char> ts;
    vector<char> gs;
    vector<char> cs;
    for (int i=0; i<str.length(); i++) {
        if (str[i] == 'T') {
            ts.push_back(str[i]);
        } else if (str[i] == 'C') {
            cs.push_back(str[i]);
        } else if (str[i] == 'G') {
            gs.push_back(str[i]);
        }
    }
    sum += pow(ts.size(), 2);
    sum += pow(gs.size(), 2);
    sum += pow(cs.size(), 2);
    while (!(ts.empty() || gs.empty() || cs.empty())) {
        sum += 7;
        ts.pop_back();
        gs.pop_back();
        cs.pop_back();
    }
    cout << sum << "\n";
}