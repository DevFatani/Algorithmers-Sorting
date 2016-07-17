package com.algorithmers;


public class QuickSort {

    /*
    *
    * src = http://www.java2novice.com/java-sorting-algorithms/quick-sort/
    *
     */


    private static int arrNum[];

    private static int n;

    public static void run(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }

        arrNum = inputArr;

        n = inputArr.length;

        quickSort(0, n - 1);


        System.out.print("Quick Sort [");

        for (int num : arrNum) {

            System.out.print(num + " ");

        }


        System.out.println("]");

    }

    private static void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = arrNum[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {

            while (arrNum[i] < pivot) {
                i++;
            }
            while (arrNum[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }


        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private static void exchangeNumbers(int i, int j) {

        int temp = arrNum[i];

        arrNum[i] = arrNum[j];

        arrNum[j] = temp;

    }

}
