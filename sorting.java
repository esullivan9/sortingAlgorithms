import java.util.Scanner;

public class sorting
{
    public static void main(String args[])
    {
        int a = 0;
        int arr[] = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

        Scanner in = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("1. Bubble Sort.");
        System.out.println("2. Insertion Sort.");
        System.out.println("3. Quicksort.");
        System.out.println("4. Selection Sort.");
        System.out.println("5. Merge Sort.");
        System.out.println("6. Radix Sort.");
        System.out.println("7. Shell Sort.");
        System.out.println("8. Heap Sort.");
        System.out.print("Make your selection: ");
        a = in.nextInt();

        if(a >= 1 || a <= 8)
        {
            switch(a)
            {
                case 1:
                    System.out.println("Unsorted: ");
                    display(arr);
                    bubbleSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 2:
                    System.out.println("Unsorted: ");
                    display(arr);
                    insertionSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 3:
                    System.out.println("Unsorted: ");
                    display(arr);
                    quickSort(arr, 0, arr.length - 1);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 4:
                    System.out.println("Unsorted: ");
                    display(arr);
                    selectionSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 5:
                    System.out.println("Unsorted: ");
                    display(arr);
                    mergeSort(arr, 0, arr.length - 1);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 6:
                    System.out.println("Unsorted: ");
                    display(arr);
                    radixSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 7:
                    System.out.println("Unsorted: ");
                    display(arr);
                    shellSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 8:
                    System.out.println("Unsorted: ");
                    display(arr);
                    heapSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                default:
                    System.out.println("You shouldn't see this...");
            }
        }
        else
            System.out.println("Invalid selection.");

        in.close();
    }


    public static void display(int A[])
    {
        System.out.println("");

        for(int i = 0; i < A.length; i++)
        {
            if(i == A.length - 1)
            {
                System.out.println(A[i] + "");
                System.out.println("");
                return;
            }

            System.out.print(A[i] + ", ");
        }

        System.out.println("");
    }

    public static void swap(int A[], int i, int j)
    {
        int tmp = A[i];

        A[i] = A[j];
        A[j] = tmp;
    }


    public static void bubbleSort(int A[])
    {
        int tmp;
        int n = A.length;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
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


    public static void insertionSort(int A[])
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


    public static void quickSort(int A[], int left, int right)
    {
        if(left >= right)
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


    public static void selectionSort(int A[])
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


    public static void mergeSort(int A[], int start, int end)
    {
        int mid = 0;

        if(start < end)
        {
            mid = (start + end) / 2;

            mergeSort(A, start, mid);
            mergeSort(A, mid + 1, end);

            merge(A, start, mid, end);
        }
    }

    public static void merge(int A[], int start, int mid, int end)
    {
        int size = end - start + 1;
        int midPos = 0;
        int leftPos = 0;
        int rightPos = 0;

        int[] tmp = new int[size];

        leftPos = start;
        rightPos = mid + 1;

        while((leftPos <= mid) && (rightPos <= end))
        {
            if(A[leftPos] <= A[rightPos])
            {
                tmp[midPos] = A[leftPos];
                leftPos++;
            }
            else
            {
                tmp[midPos] = A[rightPos];
                rightPos++;
            }

            midPos++;
        }

        while(leftPos <= mid)
        {
            tmp[midPos] = A[leftPos];
            leftPos++;
            midPos++;
        }

        while(rightPos <= end)
        {
            tmp[midPos] = A[rightPos];
            rightPos++;
            midPos++;
        }

        for(midPos = 0; midPos < size; midPos++)
            A[start + midPos] = tmp[midPos];
    }


    public static void radixSort(int A[])
    {
        int m = getMax(A);

        for(int i = 1; m / i > 0; i *= 10)
            countSort(A, i);
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

    public static void countSort(int A[], int x)
    {
        int i;
        int output[] = new int[A.length];
        int count[] = new int[10];

        for(i = 0; i < A.length; i++)
            count[(A[i] / x) % 10]++;

        for(i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for(i = A.length - 1; i >= 0; i--)
        {
            output[count[(A[i] / x) % 10] - 1] = A[i];
            count[(A[i] / x) % 10]--;
        }

        for(i = 0; i < A.length; i++)
            A[i] = output[i];
    }


    public static void shellSort(int A[])
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


    public static void heapSort(int A[])
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