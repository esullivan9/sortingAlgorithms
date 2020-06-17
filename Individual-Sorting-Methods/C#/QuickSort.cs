using System;

namespace QuickSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

            Console.WriteLine("Unsorted: ");
            Display(arr);
            Quick(arr, 0, arr.Length - 1);
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

        public static void Quick(int[] A, int left, int right)
        {
            if(left >= right)
                return;

            int pivot = A[(left + right) / 2];
            int index = Partition(A, left, right, pivot);

            Quick(A, left, index - 1);
            Quick(A, index, right);
        }

        static int Partition(int[] A, int left, int right, int pivot)
        {
            while(left <= right)
            {
                while(A[left] < pivot)
                    left++;

                while(A[right] > pivot)
                    right--;

                if(left <= right)
                {
                    Swap(A, left, right);
                    left++;
                    right--;
                }
            }

            return left;
        }

        static void Swap(int[] A, int i, int j)
        {
            int tmp = A[i];

            A[i] = A[j];
            A[j] = tmp;
        }
    }
}