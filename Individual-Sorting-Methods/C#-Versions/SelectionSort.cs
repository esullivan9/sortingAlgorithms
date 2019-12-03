using System;

namespace SelectionSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

            Console.WriteLine("Unsorted: ");
            Display(arr);
            Selection(arr);
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

        static void Selection(int[] A)
        {
            int j, k;
            for(int i = 0; i < A.Length - 1; i++)
            {
                k = i;
                for(j = i + 1; j < A.Length; j++)
                {
                    if(A[j] < A[k])
                        k = j;
                }

                Swap(A, k, i);
            }
        }

        static void Swap(int[] A, int i, int j)
        {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
        }
    }
}