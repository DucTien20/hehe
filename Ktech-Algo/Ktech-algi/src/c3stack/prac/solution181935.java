package c3stack.prac;
//https://school.programmers.co.kr/learn/courses/30/lessons/181935
public class solution181935 {
    public int solution(int n) {
        int answer = 0;

        if(n%2!=0){
            for (int i = 0; i <= n; i+=2) {
               answer+=i;
                }
        } else {
            for (int i = 0; i <= n; i+=2) {
                answer+=Math.pow(i,2);
            }
        }
        return answer;
    }
}
