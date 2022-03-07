#include <iostream>
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

const int SIZE = 1024;

int split(string str, string line[], string delim)
{
    size_t pos = 0;
    int count = 0;
    while ((pos = str.find(delim)) != string::npos)
    {
        line[count] = str.substr(0, pos);
        count++;
        str.erase(0, pos + 1);
    }
    line[count] = str.substr(0);
    return count + 1;
}

struct person
{
    string name;
    string rank;
    // long long rank;
    person(string n, string r)
    {
        name = n;
        rank = r;
    }
};

string computerank(string str)
{
    string rank;
    string arr[10];
    int count = split(str, arr, "-");
    for (int i = count - 1; i >= 0; i--)
    {
        if (arr[i] == "upper")
        {
            rank.append("3");
        }
        else if (arr[i] == "middle")
        {
            rank.append("2");
        }
        else
        {
            rank.append("1");
        }
    }
    for (int i = 0; i < 10 - count; i++)
    {
        rank.append("2");
    }
    return rank;
}

struct compare
{
    bool operator()(person const &p1, person const &p2)
    {
        if (p1.rank == p2.rank)
        {
            return p1.name < p2.name;
        }
        return p2.rank < p1.rank;
    }
};

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    string result;
    int k, n;
    cin >> k;
    for (int i = 0; i < k; i++)
    {
        cin >> n;
        vector<person> people;
        char str[SIZE];
        cin.getline(str, SIZE);
        for (int j = 0; j < n; j++)
        {
            char str[SIZE];
            cin.getline(str, SIZE);
            string line(str);
            string arr[3];
            split(str, arr, " ");
            string name = line.substr(0, line.find(":"));
            string rank = computerank(arr[1]);
            people.push_back(person(name, rank));
        }
        sort(people.begin(), people.end(), compare());
        for (size_t i = 0; i < people.size(); i++)
        {
            cout << people[i].name << "\n";
        }
        cout << "==============================\n";
    }
    return 0;
}