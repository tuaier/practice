package com.kangfw.dp;

/**
 * @author kangfw5
 * @since 2019-09-23
 */
public class QTest {

    public static void main(String[] args) {
        System.out.println(climbStairs(1232220987));
    }

    public static double climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        int third = 4;
        for (int i = 4; i <= n; i++) {
            int four = first + second + third;
            first = second;
            second = third;
            third = four;
        }
        return third;
    }
}
