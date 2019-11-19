import java.util.Scanner;

public class theSortsTest extends theSorts
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
            System.out.println("");
            System.out.println("Unsorted: ");
            display(arr);

            switch(a)
            {
                case 1:
                   
                    bubbleSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 2:
                    insertionSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 3:
                    quickSort(arr, 0, arr.length - 1);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 4:
                    selectionSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 5:
                    mergeSort(arr, 0, arr.length - 1);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 6:
                    radixSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 7:
                    shellSort(arr);
                    System.out.println("");
                    System.out.println("Sorted: ");
                    display(arr);
                    System.out.println("");
                break;

                case 8:
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
}