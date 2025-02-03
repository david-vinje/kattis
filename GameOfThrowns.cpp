#include <iostream>
#include <stack>

using namespace std;

int main()
{
    int n, k;
    cin >> n >> k;
    int pos = 0;
    stack<int> stack;
    stack.push(0);
    for (int i = 0; i < k; i++)
    {
        string command;
        cin >> command;
        if (command == "undo")
        {
            int m;
            cin >> m;
            for (int i = 0; i < m; i++)
            {
                if (!stack.empty())
                {
                    stack.pop();
                }
            }
            pos = (stack.empty() ? 0 : stack.top());
        }
        else
        {
            int i = stoi(command);
            if (i % n != 0)
            {
                // Got the formula from JonSteinn at line 14:
                // https://github.com/JonSteinn/Kattis-Solutions/blob/master/src/Game%20of%20Throwns/C/main.c
                pos = (pos+(1001 * n + i))%n;
            }
            stack.push(pos);
        }
    }
    cout << (stack.empty() ? 0 : stack.top()) << "\n";
    stack.pop();
}