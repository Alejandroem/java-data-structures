package utils;

import java.util.*;

public class DataStructuresAWSExamples {

    public void run() {
        // this.findElementsThatSumK(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 4);
        // System.out.println(this.hasBalancedParentesis("{{{{}}}}"));

        int[] test = new int[] { 5, 3, 2, 1 };
        this.mergeSort(test, 0, test.length - 1);

        for (int n : test) {
            System.out.println(n);
        }

    }

    private void mergeSort(int[] array, int low, int high) {
        if (high <= low)
            return;

        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    void merge(int[] array, int low, int mid, int high) {
        // Creating temporary subarrays
        int leftArray[] = new int[mid - low + 1];
        int rightArray[] = new int[high - mid];

        // Copying our subarrays into temporaries
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];

        // Iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    // Am I going to receive parentesis only?
    // Do I need to check for other parenteiss types
    private boolean hasBalancedParentesis(String text) {
        Stack<Character> parentesis = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            Character current = text.charAt(i);
            if (parentesis.empty() || parentesis.peek() == current) {
                parentesis.push(current);
            } else {
                parentesis.pop();
            }
        }
        return parentesis.empty();
    }

    private void findElementsThatSumK(int[] numbers, int value) {
        // 4 - 1 = 3
        // 4 - 2 = 2
        // 4 - 3 = 1
        // 4 - 4 = 0
        // 4 - 5 = -1 < 0 stop!
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int sum = value - numbers[i];
            if (map.containsKey(sum)) {
                System.out.println("Pair: " + numbers[i] + " " + sum);
            } else {
                map.put(numbers[i], sum);
                System.out.println("Added " + numbers[i] + " " + sum);
            }
        }
    }

}
