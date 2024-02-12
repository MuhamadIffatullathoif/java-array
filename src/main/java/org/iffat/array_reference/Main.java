package org.iffat.array_reference;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after anotherArray = " + Arrays.toString(anotherArray));
    }
}
