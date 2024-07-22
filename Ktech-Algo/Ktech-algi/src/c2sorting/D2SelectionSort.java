package c2sorting;

import java.util.Arrays;

public class D2SelectionSort {
    // tim phan tu nho nhat
    // roi so sanh voi phan tu dau tien
    // lap laij

    public static void selectionSort(int[] array){
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            //tu phan tu i den length - 1
            // tim gia tri nho hat trong do
            int minIdx = i;
            for (int j = i; j < length; j++) {
                if(array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            // tahy doi vi tri cua phan tu nho nhat vs phan tu dau tien
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
    }
   // cach tim phan tu nho nhat va vi tri cua no
    public static void minInArray(int[] array){
        //tao so nho nhat va index
        int min = array[0];
        int minIdx = 0;
        //

        for (int i = 0; i < array.length; i++) {
            // neu array[i] < min thi luu lai
            if(array[i] < array[minIdx]) {
              //  min = array[i];
                minIdx = i;
            }
        }
        System.out.println("min value:" + array[minIdx]);
        System.out.println("min Index: " + minIdx);
    }

    public static void main(String[] args) {
        int[] nums = {3,5,2,7,4,8};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
