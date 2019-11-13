public class quicksort
{
    public static void main(String args[])
    {
        int arr [] = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11}; 
       
        System.out.println("Unsorted: ");
        display(arr);
        quickSort(arr, 0, arr.length - 1);
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

    public static void quickSort(int A[], int left, int right)
    {
        if (left >= right)
            return; 

        int pivot = A[(left + right) / 2];
        int index = partition(A, left, right, pivot);

        quickSort(A, left, index - 1);
        quickSort(A, index, right);
    }

    public static int partition(int A[], int left, int right, int pivot) 
    {
        while(left <= right)
        {
            while(A[left] < pivot)
                left++;
            
            while(A[right] > pivot)
                right--;
            
            if(left <= right)
            {
                swap(A, left, right);
                left++;
                right--;
            }
        }
        
        return left;
    }

    public static void swap(int A[], int i, int j) 
	{
        int tmp = A[i]; 
        
		A[i] = A[j];
		A[j] = tmp; 
	}
}