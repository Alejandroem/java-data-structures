package sorting;

public class Sorting {

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int l = low;
        int h = high;
        // The idea is to decrease the L and H until they are the same
        printArray(arr);
        while (l != h) {

            // The current high, needs to be greater than the low
            if (arr[h] >= arr[l]) {
                h--;
                System.out.println("dec h " + h);
            } else if (arr[l + 1] <= arr[l]) {
                System.out.println("swap l+1 with l " + l);
                swap(arr, l + 1, l);
                l++;
            } else {
                System.out.println("Swap l+1 with h " + l + " " + h);
                swap(arr, l + 1, h);

            }
        }
        return l;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        printArray(arr);
    }

    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

}
