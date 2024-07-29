package c5brute.d2comb;

public class Combination {
    public static void main(String[] args) {
            int n =5;

        //nC3
        // lap so/ day co 3 chu so trong 0 den n-1
        System.out.println(" trong khoan 0 den n-1");
            for (int i = 0; i < n; i++) {
            // chon i
                for (int j = i +1; j < n; j++) {
                    for (int k = j +1; k < n; k++) {
                        System.out.println(i + " " + j + " " + k + " ");
                    }
                }
            }
    }
}