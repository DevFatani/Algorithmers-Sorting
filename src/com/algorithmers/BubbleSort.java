package com.algorithmers;


public class BubbleSort {

    /*
     *
     *  src = http://mathbits.com/MathBits/Java/arrays/Bubble.htm
    */
    public static void run(int[] arrNum) {

        int n = arrNum.length;

        int j;

        boolean flag = true;

        int temp;

        while (flag) {

            flag = false;

            for (j = 0; j < n - 1; j++) {

                if (arrNum[j] > arrNum[j + 1]) {

                    temp = arrNum[j];

                    arrNum[j] = arrNum[j + 1];

                    arrNum[j + 1] = temp;

                    flag = true;

                }
            }
        }


        System.out.print("Bubble Sort [");

        for (int num : arrNum) {

            System.out.print(num + " ");

        }


        System.out.println("]");

    }

}
