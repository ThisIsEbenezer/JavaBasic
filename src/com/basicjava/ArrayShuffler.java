package com.basicjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffler {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5}; // Integer array, replace with your data type

        // Convert the array to a List
        List<Integer> list = Arrays.asList(array);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled list back to an array
        list.toArray(array);

        // Print the shuffled array
        System.out.println(Arrays.toString(array));
    }
}
