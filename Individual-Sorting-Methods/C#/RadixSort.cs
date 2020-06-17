using System;

namespace RadixSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

            Console.WriteLine("Unsorted: ");
            Display(arr);
            RSort(arr);
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

        static int GetMax(int[] A)
        {
            int max = A[0];
            for(int i = 1; i < A.Length; i++)
            {
                if (A[i] > max)
                    max = A[i];
            }

            return max;
        }

        static void CountSort(int[] A, int exp)
        {
            int i;
            int[] output = new int[A.Length];
            int[] count = new int[10];

            for(i = 0; i < A.Length; i++)
                count[(A[i] / exp) % 10]++;

            for(i = 1; i < 10; i++)
                count[i] += count[i - 1];

            for(i = A.Length - 1; i >= 0; i--)
            {
                output[count[(A[i] / exp) % 10] - 1] = A[i];
                count[(A[i] / exp) % 10]--;
            }

            for(i = 0; i < A.Length; i++)
                A[i] = output[i];
        }

        static void RSort(int[] A)
        {
            int m = GetMax(A);

            for(int exp = 1; m / exp > 0; exp *= 10)
                CountSort(A, exp);
        }
    }
}