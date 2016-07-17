package com.algorithmers;


public class InsertionSort {

    /*
   *
   * src = http://mathbits.com/MathBits/Java/arrays/InsertionSort.htm
   *
    */
    public static void run(int[] arrNum) {


        int n = arrNum.length;

        int i;

        int j;

        int key;


        for (i = 1; i < n; i++) {

            key = arrNum[i];

            for (j = i - 1; (j >= 0) && (arrNum[j] > key); j--) {

                arrNum[j + 1] = arrNum[j];

            }

            arrNum[j + 1] = key;


        }

        System.out.print("Insertion Sort [");

        for (int num : arrNum) {

            System.out.print(num + " ");

        }


        System.out.println("]");

    }

}
