package c4queue.d3bfs.prac;

import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class solution196963 {
    public int[] solution(
            String[] name,
            int[] yearning,
            String[][] photos
    ){
        Map<String, Integer> yearMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            yearMap.put(name[i],yearning[i]);
        }
        int[] answer = new int[photos.length];
        // duyet qua tung photo roi tinh diem
        for (int i = 0; i < photos.length; i++) {
            String[]photo = photos[i];
            int sum =0;

            for(String person : photo){
                sum+= yearMap.getOrDefault(person,0);
            }
            answer[i] =sum;
        }
        return answer;
    }
}
