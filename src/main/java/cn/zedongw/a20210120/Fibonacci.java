package cn.zedongw.a20210120;

/**
 * @ClassName: Fibonacci
 * @Description: 斐波那契数列
 * @Author: ZeDongW
 * @Date: 2021/1/20 22:47
 * @Version: v1.0
 * @Modified By:
 * @Modified Time:
 **/
public class Fibonacci {

    private static int ONE = 1;
    private static int TWO = 2;

    /**
     * Description: 暴力枚举
     * @methodName: fib1
     * @param n 1
     * @throws
     * @return: int
     * @author: ZeDongW
     * @date: 2021/1/20 22:49
     */
    int fib1(int n) {
        if (n == ONE || n == TWO){
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    /**
     * Description: 备忘录
     * @methodName: fib2
     * @param n 1
     * @throws
     * @return: int
     * @author: ZeDongW
     * @date: 2021/1/20 22:58
     */

    int fib2(int n) {
        if (n < ONE ) {
            return 0;
        }
        // 备忘录全初始化为 0
        int[] memo = new int[n+1];
        // 初始化最简情况
        return helper(memo, n);
    }
    int helper(int[] memo, int n) {
        // base case
        if (n == ONE || n == TWO){
            return 1;
        }
        // 已经计算过
        if (memo[n] != 0){
            return memo[n];
        }
        memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
        return memo[n];
    }

    /**
     * Description: 迭代
     * @methodName: fib3
     * @param n 1
     * @throws
     * @return: int
     * @author: ZeDongW
     * @date: 2021/1/20 22:49
     */
    int fib3(int n) {
        int[] dp = new int[n+1];
        // base case
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * Description: 迭代节省空间
     * @methodName: fib4
     * @param n 1
     * @throws
     * @return: int
     * @author: ZeDongW
     * @date: 2021/1/20 22:50
     */
    int fib4(int n) {
        if (n == ONE || n == TWO){
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }
}
