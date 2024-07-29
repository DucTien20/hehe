package c5brute.d2comb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        String[] info = reader.readLine().split(" ");
        int cardCount =Integer.parseInt(info[0]);
        int score = Integer.parseInt(info[1]);

        // 카드 받아야 된다
        // tao day de luu thong tin the
        int[] cards = new int[cardCount];

        // nhan thonng tin cua the roi chia ra

        String[] cardInfo = reader.readLine().split(" ");
        // chuyen thong tin the thanh integer va luu lai
        for (int i = 0; i < cardCount; i++) {
            cards[i] = Integer.parseInt(cardInfo[i]);
        }
        //  tao bien max
        int max =0;
        // chon 3 tam the dung for
        for (int i = 0; i < cardCount -2; i++) {
            for (int j = i+1; j < cardCount-1 ; j++) {
                for (int k = j+1; k < cardCount ; k++) {
                    // de tim vi tri ma la bao duoc lay ra
                    // tim tong 3 la bai da chon
                    int sum = cards[i] + cards[j] + cards[k];
                    // sum lon nhat nhung nho hon tong max
                    if(sum <= score && sum > max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
