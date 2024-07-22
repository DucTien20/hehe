package c2sorting;

import java.util.Arrays;

public class D1BubbleSort {
    // so sanh 2 yeu to. roi xep yeu to lon hon ve ben phai
    public static void bubbleSort(int[] array) {
        // ㅂㅐ열 크기를 따로 저장한다( array.length 많이 사용하기때문)
         int length = array.length;
        // length - 1 번 반복한다
        for (int i = 0; i < length - 1; i++) {
            //
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+ 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5,3,8,2,8,4};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
