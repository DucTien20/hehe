package c2sorting.prac;
// https://school.programmers.co.kr/learn/courses/30/lessons/181938
public class solution181938 {
    public int solution( int a, int b){
        int answer = 0;
        int num = Integer.parseInt("" +a +b);

        answer = Math.max(num, (2 * a * b));

        return answer;
    }

}
