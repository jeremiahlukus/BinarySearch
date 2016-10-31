package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = { 2, 4,7,32,55,65,76,87,98,100};

        int search = 7;
        BinarySearchAlgorithm b = new BinarySearchAlgorithm();
        int size = arr.length;

        int searchPos = b.binarySearch(arr, size, search);

        if (searchPos == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index: " + searchPos);
        }

    }
}
