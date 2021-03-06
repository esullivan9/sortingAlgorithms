public class insertionSort
{
    public static void main(String args[])
    {
        int arr[] = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

        System.out.println("Unsorted: ");
        display(arr);
        insertion(arr);
        System.out.println("");
        System.out.println("Sorted: ");
        display(arr);
        System.out.println("");
    }

    public static void display(int A[])
    {
        System.out.println("");

        for(int i = 0; i < A.length; i++)
        {
            if(i == A.length - 1) 
            {
                System.out.print(A[i] + "");
                System.out.println("");
                return;
            }

			System.out.print(A[i] + ", ");
        }
        
        System.out.println("");
    }

    public static void insertion(int A[])
    {
        int tmp = 0;

        for(int i = 1; i < A.length; i++)
        {
            while(i > 0 && A[i] < A[i - 1])
            {
                tmp = A[i];
                A[i] = A[i - 1];
                A[i - 1] = tmp;
                i--;
            }
        }
    }
}