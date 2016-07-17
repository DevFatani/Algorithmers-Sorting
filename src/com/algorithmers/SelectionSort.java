package com.algorithmers;


public class SelectionSort {
    /*
  *
  * src = http://www.java2novice.com/java-sorting-algorithms/selection-sort/
  *
   */
    public static void run(int[] arrNum) {

        int n = arrNum.length;

        for (int i = 0; i < n - 1; i++) {

            int index = i;

            for (int j = i + 1; j < n; j++) {

                if (arrNum[j] < arrNum[index]){

                    index = j;


                }

            }


            int smallerNumber = arrNum[index];

            arrNum[index] = arrNum[i];

            arrNum[i] = smallerNumber;

        }


        System.out.print("SelectionSort [");

        for (int num : arrNum) {

            System.out.print(num + " ");

        }


        System.out.println("]");


    }

}
