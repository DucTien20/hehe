package c5brute.d1perm;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] data = {4,5,6};



        // tao so 3 chu so tu cac so 0,1,2
        // chonj 1 rong 3 so 1 2 3
        for (int i = 0; i < 3; i++) {
            // chon so i
            // chon so tiep theo
            for (int j = 0; j < 3; j++) {
                // neu gap so da chon thi bo qua
                if( i == j) continue;;
                //chon so j
                // chon so tiep theo
                for (int k = 0; k < 3; k++) {
                    // neu lap lai bo qua
                    if( i == k || j == k) continue;
                    System.out.println(i + " "+ j + " " + k + " ");
                }
            }
        }
        //  lap 3 so tu cac so 0-9
        System.out.println("lap 3 so tu cac so 0-9");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if( j == i) continue;
                for (int k = 0; k < 10; k++) {
                    if( i == k || j == k) continue;
                    System.out.println(i + " "+ j + " " + k + " ");
                }
            }
        }
    }

    private void permRecursive(
            int n, int r,
            // 몇번째 원소를 골랐는지 표시하는 변수
            int k,
            // 현재 만들고 있는 순열을 저장할 변수
            int[] perm,
            // 사용한 숫자를 판단할 배열
            boolean[] used
    ) {
        if (k == r) {
            System.out.println(Arrays.toString(perm));
            return;
        }
        // 숫자를 0 ~ n-1 까지 살펴본다.
        for (int i = 0; i < n; i++) {
            // i가 이미 사용되었으면 건너뛴다.
            if (used[i]) continue;
            // 이번에 선택한 결과(i)를
            // 내가 만들고 있는 순열의 k에 추가한다.
            perm[k] = i;
            // 사용했다고 기록
            used[i] = true;
            // 다음 숫자를 고르라고 재귀호출한다.
            permRecursive(n, r, k + 1, perm, used);
            // 재귀호출이 끝나면, 사용했던 숫자를 반납한다.
            used[i] = false;
        }
    }
}
