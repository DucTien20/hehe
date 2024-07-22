import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class testStringBuilder {
    public static String makeString(int n) {
        StringBuilder builder = new StringBuilder();
        // 1 1 1 1 1 1 1 1 1 1
        for (int i = 0; i < n; i++) {
            builder.append("1 ");
        }
        return builder.toString();
    }

    public static void bufferedReader(String line) throws IOException {
        BufferedReader reader = new BufferedReader(new StringReader(line));
        String[] tokens = reader.readLine().split(" ");
        for (int i = 0; i < tokens.length; i++) {
            Integer.parseInt(tokens[i]);
        }
    }
}
