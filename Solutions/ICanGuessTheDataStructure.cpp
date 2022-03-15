#include <iostream>
#include <queue>
#include <stack>

using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int k, a, e, i;
    while (cin >> k)
    {
        bool isQueue = true, isStack = true, isPQ = true, done = false;
        queue<int> queue;
        stack<int> stack;
        priority_queue<int> PQ;
        for (i = 0; i < k; i++)
        {
            cin >> a >> e;
            if (a == 1)
            {
                queue.push(e);
                stack.push(e);
                PQ.push(e);
            }
            else
            {
                if (isQueue && !queue.empty())
                {
                    isQueue = queue.front() == e;
                    queue.pop();
                }
                else
                {
                    isQueue = false;
                }
                if (isStack && !stack.empty())
                {
                    isStack = stack.top() == e;
                    stack.pop();
                }
                else
                {
                    isStack = false;
                }
                if (isPQ && !PQ.empty())
                {
                    isPQ = PQ.top() == e;
                    PQ.pop();
                }
                else
                {
                    isPQ = false;
                }
            }
        }
        if (isQueue && !(isPQ || isStack))
        {
            cout << "queue"
                 << "\n";
        }
        else if (isPQ && !(isQueue || isStack))
        {
            cout << "priority queue"
                 << "\n";
        }
        else if (isStack && !(isPQ || isQueue))
        {
            cout << "stack"
                 << "\n";
        }
        else if (!(isQueue || isPQ || isStack))
        {
            cout << "impossible"
                 << "\n";
        }
        else
        {
            cout << "not sure"
                 << "\n";
        }
    }
}