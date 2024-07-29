package c3stack.prac.prac중;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

//https://www.acmicpc.net/problem/20001
public class solution20001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> animal = new Stack<>();
        String command = sc.nextLine();
        while(true){

            if(command.equals("문제")){
                animal.push(command);
            } else if (sc.equals("고무오리")) {
                if(animal.empty()){
                    System.out.println("힝구");
                }

            }
        }
    }
}

