package c3stack.prac;
//https://school.programmers.co.kr/learn/courses/30/lessons/181934
public class solution181934 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals(">") && eq.equals("=")) {
            return answer = n >= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            return answer = n > m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            return  n <= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            return answer = n < m ? 1 : 0;
        }
    return answer;
    }
}