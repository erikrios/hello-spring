package com.erikriosetiawan.hellospring;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        // Sort the numbers
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        // Do searching logic
        return 3;
    }
}
