package c2sorting.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solution10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String isPalindrone = reader.readLine();
        int result = 1;
        for (int i = 0; i < isPalindrone.length() /2 ; i++) {
            if(isPalindrone.charAt(i) != isPalindrone.charAt(isPalindrone.length()-i-1));
            {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}
