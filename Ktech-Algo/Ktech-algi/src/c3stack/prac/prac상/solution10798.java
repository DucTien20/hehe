package c3stack.prac.prac상;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution10798 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        char[][] letter = new char[5][];
        // 단어 길에
        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            letter[i] = reader.readLine().toCharArray();
            maxLength = Math.max(letter[i].length, maxLength);
        }
        StringBuilder answer = new StringBuilder();
        //maxLength 만큼 밤복
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if(!(i < letter[j].length)) continue;
               // 글자 저장
                answer.append(letter[j][i]);
            }
        }
        System.out.println(answer);
    }
}