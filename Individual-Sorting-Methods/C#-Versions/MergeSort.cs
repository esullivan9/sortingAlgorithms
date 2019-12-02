using System;

namespace MergeSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

            Console.WriteLine("Unsorted: ");
            Display(arr);
            Sort(arr, 0, arr.Length - 1);
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

        static void Sort(int[] A, int start, int end)
        {
            int mid = 0;

            if(start < end)
            {
                mid = (start + end) / 2;

                Sort(A, start, mid);
                Sort(A, mid + 1, end);

                Merge(A, start, mid, end);
            }
        }

        static void Merge(int[] A, int start, int mid, int end)
        {
            int mSize = end - start + 1;
            int mPosition = 0;
            int leftPosition = 0;
            int rightPosition = 0;

            int[] mergedNumbers = new int[mSize];

            leftPosition = start;
            rightPosition = mid + 1;

            while((leftPosition <= mid) && (rightPosition <= end))
            {
                if(A[leftPosition] <= A[rightPosition])
                {
                    mergedNumbers[mPosition] = A[leftPosition];
                    leftPosition++;
                }
                else
                {
                    mergedNumbers[mPosition] = A[rightPosition];
                    rightPosition++;
                }

                mPosition++;
            }

            while(leftPosition <= mid)
            {
                mergedNumbers[mPosition] = A[leftPosition];
                leftPosition++;
                mPosition++;
            }

            while(rightPosition <= end)
            {
                mergedNumbers[mPosition] = A[rightPosition];
                rightPosition++;
                mPosition++;
            }

            for(mPosition = 0; mPosition < mSize; mPosition++)
                A[start + mPosition] = mergedNumbers[mPosition];
        }
    }
}
