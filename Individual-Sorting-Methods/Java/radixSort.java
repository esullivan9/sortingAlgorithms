public class radixSort
{
    public static void main(String args[])
    {
        int arr[] = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

        System.out.print("Unsorted: ");
        display(arr);
        rSort(arr);
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

    public static int getMax(int A[])
    {
        int max = A[0];
        for(int i = 1; i < A.length; i++)
        {
            if(A[i] > max)
                max = A[i];
        }

        return max;
    }

    public static void countSort(int A[], int exp)
    {
        int i;
        int output[] = new int[A.length];
        int count[] = new int[10];

        for(i = 0; i < A.length; i++)
            count[(A[i] / exp) % 10]++;

        for(i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for(i = A.length - 1; i >= 0; i--)
        {
            output[count[(A[i] / exp) % 10] - 1] = A[i];
            count[(A[i] / exp) % 10]--;
        }

        for(i = 0; i < A.length; i++)
            A[i] = output[i];
    }

    public static void rSort(int A[])
    {
        int m = getMax(A);

        for(int exp = 1; m / exp > 0; exp *= 10)
            countSort(A, exp);
    }
}