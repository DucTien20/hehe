package c2sorting.prac;

//https://school.programmers.co.kr/learn/courses/30/lessons/181939

import java.util.Arrays;

public class solution191939 {
    public static int solution191939(int a, int b){
        int answer = 0;

        int num1 = Integer.parseInt(""+a + b);
        int num2 = Integer.parseInt(""+ b+ a);
        answer = Math.max(num1, num2);
        return answer;
    }
}
