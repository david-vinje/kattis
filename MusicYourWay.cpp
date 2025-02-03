#include <iostream>
#include <sstream>
#include <map>
#include <string>
using namespace std;

const int SIZE = 1024;

void insertion(string songs[], int n)
{

    for (int i = 1; i < n; i++)
    {
        string fullKey = songs[i];
        string key = songs[i].substr(0, songs[i].find(" "));
        int j = i - 1;
        while (j >= 0 && key < songs[j].substr(0, songs[j].find(" ")))
        {
            songs[j + 1] = songs[j];
            j--;
        }
        songs[j + 1] = fullKey;
    }
}

// Found the split string on Stack Overflow:
// https://stackoverflow.com/questions/14265581/parse-split-a-string-in-c-using-string-delimiter-standard-c
int split(string attStr, string attArr[])
{
    string token;
    size_t pos = 0, nAtt = 0;
    while ((pos = attStr.find(" ")) != string::npos)
    {
        token = attStr.substr(0, pos);
        attArr[nAtt] = token;
        nAtt++;
        attStr.erase(0, pos + 1);
    }
    attArr[nAtt] = attStr;
    return nAtt+1;
}

string swap(int key, string song)
{   
    string atts[SIZE];
    int nAtts = split(song, atts);
    string tmp = atts[0];
    atts[0] = atts[key];
    atts[key] = tmp;
    string builder;
    for (int i = 0; i < nAtts; i++)
    {
        builder.append(atts[i] + " ");
    }
    return builder;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    char attStr[SIZE];
    cin.getline(attStr, SIZE);
    string attArr[SIZE];
    int nAtt = split(attStr, attArr);
    map<string, int> attMap;
    for (int i = 0; i < nAtt; i++)
    {
        attMap.insert(pair<string, int>(attArr[i], i));
    }
    int nSongs;
    cin >> nSongs;
    string songs[nSongs];
    char song[SIZE];
    cin.getline(song, SIZE);
    for (int i = 0; i < nSongs; i++)
    {
        cin.getline(song, SIZE);
        songs[i] = song;
    }
    int nSorts;
    cin >> nSorts;
    for (int i = 0; i < nSorts; i++)
    {
        cout << attStr << "\n";
        string att;
        cin >> att;
        int key = attMap.at(att);
        for (int j = 0; j < nSongs; j++)
        {
            if (key == 0)
                break;
            songs[j] = swap(key, songs[j]);
        }
        insertion(songs, nSongs);
        for (int j = 0; j < nSongs; j++)
        {
            if (key != 0)
                songs[j] = swap(key, songs[j]);
            cout << songs[j] << "\n";
        }
        cout << "\n";
    }
    return 0;
}