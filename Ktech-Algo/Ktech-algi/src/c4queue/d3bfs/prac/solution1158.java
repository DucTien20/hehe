package c4queue.d3bfs.prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://www.acmicpc.net/problem/1158
public class solution1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        // N and K 구한다

        String[] info = reader.readLine().split(" ");
        int n = Integer.parseInt(info[0]);
        int k = Integer.parseInt(info[1]);

        List<Integer> result = new ArrayList<>();
        Queue<Integer> people = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            people.offer(i + 1);
        }
        int round = 0;
        while (!people.isEmpty()) {
            int person = people.poll();
            if (round == k - 1) {
                result.add(person);
                round = 0;
            } else {
                people.offer(person);
                round++;
            }
        }
        StringBuilder answer = new StringBuilder();
        answer.append('<');
        String resultString = result.toString();
        answer.append(resultString, 1, resultString.length() - 1);
        answer.append('>');
        System.out.println(answer);
    }
}