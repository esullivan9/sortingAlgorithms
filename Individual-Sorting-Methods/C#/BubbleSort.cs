using System;

namespace BubbleSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

            Console.WriteLine("Unsorted: ");
            Display(arr);
            Bubble(arr);
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

        static void Bubble(int[] A)
        {
            int tmp;
            for(int i = 0; i < A.Length; i++)
            {
                for(int j = 0; j < A.Length - i - 1; j++)
                {
                    if(A[j] > A[j + 1])
                    {
                        tmp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = tmp;
                    }
                }
            }
        }
    }
}