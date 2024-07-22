package c2sorting;

import java.util.Arrays;

public class D3CountingSort {

    public static void countingSort(int[] array){
        //원래 max 찾아야되지만 스킵
        //데이터 줄현휫수 파악 count 생선

        int[] counts = new int[6];
        //array의 데이터 순회하면서 counts update

        for( int data : array){
            counts[data]++;
        }
        System.out.println(Arrays.toString(counts));
        //counts의 뛰쪽 원소에 앞쪽 원소의 값을 더해준다

        for (int i = 0; i < counts.length - 1; i++) {
            counts[i+1] +=counts[i];

        }
        System.out.println(Arrays.toString(counts));

        //결과를 담아줄 배열을 만든다
        int[] output = new int[array.length];

        //뒤에서부터 array를 확인하여
        //counts[data] - 1 의위지에 엏어준다
        for (int i = array.length - 1; i >= 0; i--) {
            //이번에 데이터의 counts를 줄여준다
            counts[array[i]]--;

            int position = counts[array[i]];
            output[position] = array[i];

        }
        System.out.println(Arrays.toString(output));
    }

    public static void main(String[] args) {
        countingSort(new int[]{0,1,4,4,5,3});
    }
}
