import java.util.Scanner;

public class sortingMain extends sortingMethods
{
    public static void main(String args[])
    {
        int a = 0;
        Scanner in = new Scanner(System.in);

        //Enter your unsorted numbers here!
        int arr[] = {3, 2, 5, 1, 4, 10, 9, 6, 8, 7, 13, 12, 11};

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
            System.out.println("");
            System.out.print("Unsorted: ");
            display(arr);

            sortMe(a, arr);

            System.out.println("");
            System.out.print("Sorted: ");
            display(arr);
            System.out.println("");
        }
        else
            System.out.println("Invalid selection.");

        in.close();
    }

    public static void sortMe(int a, int arr[])
    {
        switch(a)
        {
            case 1:
                bubbleSort(arr);
            break;

            case 2:
                insertionSort(arr);
            break;

            case 3:
                quickSort(arr, 0, arr.length - 1);
            break;

            case 4:
                selectionSort(arr);
            break;

            case 5:
                mergeSort(arr, 0, arr.length - 1);
            break;

            case 6:
                radixSort(arr);
            break;

            case 7:
                shellSort(arr);
            break;

            case 8:
                heapSort(arr);
            break;

            default:
                System.out.println("You shouldn't see this...");
        }
    }
}