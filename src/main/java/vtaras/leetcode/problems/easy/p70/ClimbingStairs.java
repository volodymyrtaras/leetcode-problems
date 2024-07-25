package vtaras.leetcode.problems.easy.p70;

/*
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 * Constraints:
 *
 * 1 <= n <= 45
 */
public class ClimbingStairs {

    /*
        - number of steps to reach some number is similar to Fibonacci sequence: F(n) = F(n-1) + F(n-2)
        - if n is 1, return 1
        - if no, create an array to store number of ways how we can reach the number
        - assign 1 as array[1] - there is only one way to reach 1
        - assign 2 as array[2] - there is only one way to reach 2
        - iterate other numbers from 3 to n (including), assigning to array sum of 2 previous number of ways
        - return the last number in the array
    */
    public int climbStairs(int n) {
        int steps;

        if (n == 1) {
            steps = 1;
        } else {
            int[] numberOfWaysToReachEachNumber = new int[n + 1];

            numberOfWaysToReachEachNumber[1] = 1;
            numberOfWaysToReachEachNumber[2] = 2;

            for (int i = 3; i <= n; i++) {
                numberOfWaysToReachEachNumber[i] = numberOfWaysToReachEachNumber[i - 1] + numberOfWaysToReachEachNumber[i - 2];
            }

            steps = numberOfWaysToReachEachNumber[n];
        }

        return steps;
    }
}
