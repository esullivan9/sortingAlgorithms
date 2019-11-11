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

    public static void quickSort(int arr[], int left, int right)
    {
        if (left >= right)
            return; 

        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);

        quickSort(arr, left, index - 1);
        quickSort(arr, index, right);
    }

    public static int partition(int arr[], int left, int right, int pivot) 
    {
        while(left <= right)
        {
            while(arr[left] < pivot)
                left++;
            
            while(arr[right] > pivot)
                right--;
            
            if(left <= right)
            {
                swap(arr, left, right);
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