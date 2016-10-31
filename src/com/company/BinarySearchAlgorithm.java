package com.company;

/**
 * Created by Jeremiah on 10/28/16.
 */
public class BinarySearchAlgorithm {


    public int binarySearch(int[] arr, int size, int search) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] > search) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return -1;

    }

}
