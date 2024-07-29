package c3stack.d2par;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ParTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(test(reader.readLine()));
    }
    private static boolean test(String line){
        // java 의 stack
        Stack<Character> parStack = new Stack<>();

        // line의 글자를 확인한다
        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);
            if(letter == '('){
                parStack.push(letter);
            }
            else if (letter == ')') {
                if(parStack.empty()) return false;
                char top = parStack.pop();
                if (top != '(') return false;
            }
        }

        //만약 글자가 (  라면? 스텍 푸시하다

        // ) 라면 pop 하려고한다

        // 스텍 비어지면 true : false
        return parStack.isEmpty();
    }
}
