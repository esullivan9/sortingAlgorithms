public class heapSort
{
    public static void main(String args[])
    {
        int arr[] = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

        System.out.print("Unsorted: ");
        display(arr);
        sort(arr);
        System.out.println("");
        System.out.print("Sorted: ");
        display(arr);
        System.out.println("");
    }

    public static void display(int A[])
    {
        System.out.print("");
        
        for(int j = 0; j < A.length; j++)
        {
            if(j == A.length - 1)
            {
                System.out.print(A[j] + "");
                System.out.println("");
                return;
            }

            System.out.print(A[j] + ", ");
        }

        System.out.println("");
    }

    public static void sort(int A[])
    {
        int tmp;
        for(int i = A.length / 2 - 1; i >= 0; i--)
            heap(A, A.length, i);

        for(int i = A.length - 1; i >= 0; i--)
        {
            tmp = A[0];
            A[0] = A[i];
            A[i] = tmp;

            heap(A, i, 0);
        }
    }

    public static void heap(int A[], int n, int i)
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

            heap(A, n, largest);
        }
    }
}