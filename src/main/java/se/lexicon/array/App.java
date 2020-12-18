package se.lexicon.array;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] indexOf = {2,4,5,6,9};

        int indexFound = Arrays.binarySearch(indexOf, (5));
        System.out.println(indexFound);
        int indexNotFound = Arrays.binarySearch(indexOf, (-1));
        System.out.println(indexNotFound);
    }
}