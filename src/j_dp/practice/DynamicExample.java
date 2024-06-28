package j_dp.practice;

import java.util.HashMap;
import java.util.Map;

public class DynamicExample {
    // 피보나치 수열: dp로 구현
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        }
//
//        int[] values = new int[n + 1];
//        values[0] = 0;
//        values[1] = 1;
//
//        for (int i = 2; i <= n; i++) {
//            values[i] = values[i - 1] + values[i - 2];
//        }
//
//        return values[n];
//    }

    // 피보나치 수열: 재귀로 구현
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }

    // 피보나치 수열: 메모제이션으로 구현
    public static Map<Long, Long> memo = new HashMap<>() {

    };
    public static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        } else if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
                long result =  fibonacci(n - 1) + fibonacci(n - 2);
                memo.put(n, result);
                return result;
        }
    }
}
