#include <iostream>
using namespace std;

string removeDuplicates(string s, int i);

int main()
{
    string s;
    cin >> s;
    for (int i = 1; i < s.size(); i++)
    {
        while (s[i] == s[i - 1])
        {
            s = removeDuplicates(s, i);
        }
    }
    cout << s << endl;
}

string removeDuplicates(string s, int i)
{
    string s1 = s.substr(0, i);
    string s2 = s.substr(i + 1);
    return (s1 + s2);
}