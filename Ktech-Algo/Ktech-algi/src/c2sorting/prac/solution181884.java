package c2sorting.prac;

public class solution181884 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int num = 0;
            for(int s : numbers){
                for (int i = 0; i < numbers.length; i++) {
                    num+=numbers[i];
                }
                if(num > n){
                    answer = num;
                    break;
                }
            }
        return answer;
    }
}
