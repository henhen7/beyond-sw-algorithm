package j_dp;

import j_dp.practice.DynamicExample;

public class DPApplication {
    public static void main(String[] args) {
        long n = 75L;
        System.out.printf("피보나치 수열의 %d번째 항의 값은 %d입니다.\n", n, DynamicExample.fibonacci(n));
//        for (int i = 1; i <= n; i++) {
//            System.out.printf("피보나치 수열의 %d번째 항의 값은 %d입니다.\n", i, DynamicExample.fibonacci(i));
//        }
    }
}
