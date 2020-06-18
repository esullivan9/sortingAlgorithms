public class mergeSort
{
    public static void main(String args[])
    {
        int arr[] = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

        System.out.println("Unsorted: ");
        display(arr);
        mSort(arr, 0, arr.length - 1);
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

    public static void mSort(int A[], int start, int end)
    {
        int mid = 0;

        if(start < end)
        {
            mid = (start + end) / 2;

            mSort(A, start, mid);
            mSort(A, mid + 1, end);

            merge(A, start, mid, end);
        }
    }

    public static void merge(int A[], int start, int mid, int end)
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