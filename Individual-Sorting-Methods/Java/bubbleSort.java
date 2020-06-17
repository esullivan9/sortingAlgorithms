public class bubbleSort
{
    public static void main(String args[])
    {
        int arr[] = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

        System.out.print("Unsorted: ");
        display(arr);
        bubble(arr);
        System.out.println("");
        System.out.print("Sorted: ");
        display(arr);
        System.out.println("");
    }

    public static void display(int A[])
    {
        System.out.print("");

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

    public static void bubble(int A[])
    {
        int tmp;
        for(int i = 0; i < A.length - 1; i++)
        {
            for(int j = 0; j < A.length - i - 1; j++)
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