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
        int in, min;
        for(int out = 0; out < A.length - 1; out++)
        {
            min = out;
            for(in = out + 1; in < A.length; in++)
            {
                if(A[in] < A[min])
                    min = in;
            }

            swap(A, min, out);
        }
    }

    public static void swap(int A[], int i, int j)
    {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}