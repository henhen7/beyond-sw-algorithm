package i_greedy;

import i_greedy.practice.GreedyExample;

public class GreedyApplication {
    public static void main(String[] args) {
        // 거스름돈 문제
        int amount = 635;
        int[] coins = {100, 10, 500, 1};

        System.out.println("전체 필요한 동전의 개수: " + GreedyExample.minCoins(amount, coins));
        System.out.println();

        // 활동 선택 문제
        int[][] activities = {{1, 4}, {3, 5}, {0, 6}, {5, 7}, {3, 9}, {5, 9}, {6, 10}, {8, 11}, {8, 12}, {12, 16}};
        System.out.print("최대 활동 수: " + GreedyExample.maxActivities(activities));
        System.out.println();
    }
}
