package com.algorithmers;


public class HeapSort {

    private static int[] arrNum;

    private static int n;

    private static int left;

    private static int right;

    private static int largest;


    public static void buildHeap(int []a){
        n=a.length-1;
        for(int i=n/2;i>=0;i--){
            maxHeap(a,i);
        }
    }

    public static void maxHeap(int[] a, int i){
        left=2*i;
        right=2*i+1;
        if(left <= n && a[left] > a[i]){
            largest=left;
        }
        else{
            largest=i;
        }

        if(right <= n && a[right] > a[largest]){
            largest=right;
        }
        if(largest!=i){
            exchange(i,largest);
            maxHeap(a, largest);
        }
    }

    public static void exchange(int i, int j){

        int t= arrNum[i];

        arrNum[i]= arrNum[j];

        arrNum[j]=t;

    }

    public static void run(int []a0){
        arrNum =a0;
        buildHeap(arrNum);

        for(int i=n;i>0;i--){

            exchange(0, i);

            n=n-1;

            maxHeap(arrNum, 0);

        }


        System.out.print("Max Heap Sort [");

        for (int num : arrNum) {

            System.out.print(num + " ");

        }


        System.out.println("]");

    }

}
