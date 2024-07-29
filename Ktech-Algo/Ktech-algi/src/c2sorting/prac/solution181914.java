package c2sorting.prac;

import java.util.ArrayList;

// https://school.programmers.co.kr/learn/courses/30/lessons/181914
public class solution181914 {
    public int solution( String number){
       int answer = 0;
       int num = 0;
      char[] Array = number.toCharArray();

      for(char s : Array){
          int temp = Integer.parseInt(String.valueOf(s));
          num+=temp;
      }
      answer = num %9;

      return answer;

    }
}
