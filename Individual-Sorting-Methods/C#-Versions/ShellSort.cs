using System;

namespace ShellSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

            Console.WriteLine("Unsorted: ");
            Display(arr);
            Shell(arr);
            Console.ReadKey();

            Console.WriteLine("");
            Console.WriteLine("Sorted: ");
            Display(arr);
            Console.WriteLine("");

            Console.ReadKey();
        }

        static void Display(int[] A)
        {
            Console.WriteLine("");

            for(int i = 0; i < A.Length; i++)
            {
                if(i == A.Length - 1)
                {
                    Console.Write(A[i] + "");
                    Console.WriteLine("");
                    return;
                }

                Console.Write(A[i] + ", ");
            }

            Console.WriteLine("");
        }

        static void Shell(int[] A)
        {
            int tmp, j;
            for(int gap = A.Length / 2; gap > 0; gap /= 2)
            {
                for(int i = gap; i < A.Length; i += 1)
                {
                    tmp = A[i];
                    for(j = i; j >= gap && A[j - gap] > tmp; j -= gap)
                        A[j] = A[j - gap];

                    A[j] = tmp;
                }
            }
        }
    }
}