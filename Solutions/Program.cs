using System;

namespace _3DPrintedStatues
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = 1;
            int k = Convert.ToInt16(Console.ReadLine());
            while (n < k)
            {
                n *= 2;

            }
            Console.WriteLine(Math.Log(n, 2)+1);
        }
    }
}
