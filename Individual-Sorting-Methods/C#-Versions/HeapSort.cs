using System;

namespace HeapSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

            Console.WriteLine("Unsorted: ");
            Display(arr);
            Sort(arr);
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

        static void Sort(int[] A)
        {
            int tmp;
            for(int i = A.Length / 2 - 1; i >= 0; i--)
                Heap(A, A.Length, i);

            for(int i = A.Length - 1; i >= 0; i--)
            {
                tmp = A[0];
                A[0] = A[i];
                A[i] = tmp;

                Heap(A, i, 0);
            }
        }

        static void Heap(int[] A, int n, int i)
        {
            int swap;
            int largest = i;
            int l = 2 * i + 1;
            int r = 2 * i + 2;

            if(l < n && A[l] > A[largest])
                largest = l;

            if(r < n && A[r] > A[largest])
                largest = r;

            if(largest != i)
            {
                swap = A[i];
                A[i] = A[largest];
                A[largest] = swap;

                Heap(A, n, largest);
            }
        }
    }
}