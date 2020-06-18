public class selectionSort
{
    public static void main(String args[])
    {
        int arr[] = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

        System.out.println("Unsorted: ");
        display(arr);
        selection(arr);
        System.out.println("");
        System.out.println("Sorted: ");
        display(arr);
        System.out.println("");
    }

    public static void display(int A[])
    {
        System.out.println("");
        
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

    public static void selection(int A[])
    {
        int j, k;
        for(int i = 0; i < A.length - 1; i++)
        {
            k = i;
            for(j = i + 1; j < A.length; j++)
            {
                if(A[j] < A[k])
                    k = j;
            }

            swap(A, k, i);
        }
    }

    public static void swap(int A[], int i, int j)
    {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}