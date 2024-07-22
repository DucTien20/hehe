package c1basics;

public class D1TimeComplexity {
    // tong tu 1 den n
    public static int sumUntilN1(int n){
      //할당 1번
        int sum = 0;
        for (int i = 1; i < n; i++) {
           //계산 1번, 할당 1번
            sum+=i;
        }
        return sum;
    }
    public static int sumUntilN2(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(sumUntilN1(10));
        System.out.println(sumUntilN1(100));
        System.out.println(sumUntilN1(1000));

        long endTime = System.nanoTime();
        System.out.println(" 종 걸린 시간(ns): "+(endTime - startTime));

        startTime=System.nanoTime();
        System.out.println(sumUntilN2(10));
        System.out.println(sumUntilN2(100));
        System.out.println(sumUntilN2(1000));

        endTime = System.nanoTime();

        System.out.println(" 종 걸린 시간(ns): "+(endTime - startTime));

    }
}
