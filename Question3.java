package org.example;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] someNums = {10, 5, 20, 25, 29, 27, 22, 12, 8};
        for (int i = 0; i < someNums.length - 1; i++) {

            for (int b = 0; b <  someNums.length - 1; b++) {
                if (someNums[i] > someNums[b]) {
                    int temp = someNums[i];
                    someNums[i] = someNums[b -1];
                    someNums[b - 1] = temp;
                }
                System.out.println(Arrays.toString(someNums));
            }
        }
    }
}
