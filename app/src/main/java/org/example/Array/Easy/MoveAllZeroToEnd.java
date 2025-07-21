package org.example.Array.Easy;

public class MoveAllZeroToEnd {

    public static int[] moveZerosToEnd(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return arr; // Return the array as is if it's null or empty
        }
        int nonZeroIndex = 0;
        int zeroIndex = 0;
        while (zeroIndex < arr.length) {
            if (arr[zeroIndex] != 0) {
                zeroIndex++;
            } else {
                nonZeroIndex = zeroIndex;
                while (nonZeroIndex < arr.length && arr[nonZeroIndex] == 0) {
                    nonZeroIndex++;
                }
                if (nonZeroIndex < arr.length) {
                    // Swap the non-zero element with the zero element
                    int temp = arr[zeroIndex];
                    arr[zeroIndex] = arr[nonZeroIndex];
                    arr[nonZeroIndex] = temp;
                }
                zeroIndex++;
            }
        }

        return arr; // Return the modified array with all zeros moved to the end
    }

    public static int[] moveZerosToEnd1(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return arr; // Return the array as is if it's null or empty
        }
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i]; // Move non-zero elements to the front
            }
        }
        // Fill the rest of the array with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
        return arr; // Return the modified array with all zeros moved to the end
    }
}
