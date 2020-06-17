public class shellSort
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
        int tmp, j;
        for(int gap = A.length / 2; gap > 0; gap /= 2)
        {
            for(int i = gap; i < A.length; i += 1)
            {
                tmp = A[i];
                for(j = i; j >= gap && A[j - gap] > tmp; j-= gap)
                    A[j] = A[j - gap];

                A[j] = tmp;
            }
        }
    }
}