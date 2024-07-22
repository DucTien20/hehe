package c2sorting;

public class D4BinarySearch {
    //탐색 범위를 벌반씩 줄여가며

    public static int binarySearch(
            //대상 배열
            int[] array,
            //찾고 있는 숫자
            int target){
        // thiet lap left va right

        int left = 0;
        int right = array.length - 1;

        // 언제까지 탐색할 것인가?
       // 범위가 소진되었을때
        while( left <= right){
            int mid = (left + right) /2;

            if(array[mid] == target){
                return mid; //탐색 성공
            }
            else if (array[mid] > target){
                right = mid -1;
            } else if (array[mid] < target) {
                left = mid + 1;

            }
        }
        //탐색 실패
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {0,12,32,44,55,65,77};
        System.out.println(binarySearch(numbers, 77));
    }

}
