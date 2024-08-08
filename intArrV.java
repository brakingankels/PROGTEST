package org.example;

import java.util.Arrays;
import java.util.Random;

public class intArrV {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArr  = new int[50];
        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(50);
            System.out.println(Arrays.toString(intArr));
        }
    }
}
