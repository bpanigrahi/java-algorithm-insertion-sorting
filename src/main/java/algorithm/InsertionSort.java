package algorithm;

import java.util.Arrays;

public class InsertionSort {

    int[] input = {9, 7, 6, 5, 4, 1};
    int[] expected = {1, 4, 5, 6, 7, 9};

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.run();
    }

    public void run() {

        System.out.println("input: "+ Arrays.toString(input));

        for (int i = 1; i < input.length; i++) {

            int temp = input[i];
            int j = i - 1; // j Represents sorted list.

            while (j >= 0 && input[j] > temp) {
                input[j + 1] = input[j]; // Right Shift
                j--;

                System.out.println("input: "+ Arrays.toString(input) + " temp: "+ temp);
            }

            input[j + 1] = temp;
            System.out.println("input: "+ Arrays.toString(input) + " temp: "+ temp);
        }
        System.out.println("input: "+ Arrays.toString(input));
        System.out.println("is equal: " + Arrays.equals(expected, input));
    }

}
