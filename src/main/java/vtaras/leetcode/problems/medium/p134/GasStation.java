package vtaras.leetcode.problems.medium.p134;

/*
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 *
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
 *
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1.
 * If there exists a solution, it is guaranteed to be unique.
 *
 * Example 1:
 *
 * Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
 * Output: 3
 * Explanation:
 * Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
 * Travel to station 4. Your tank = 4 - 1 + 5 = 8
 * Travel to station 0. Your tank = 8 - 2 + 1 = 7
 * Travel to station 1. Your tank = 7 - 3 + 2 = 6
 * Travel to station 2. Your tank = 6 - 4 + 3 = 5
 * Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
 * Therefore, return 3 as the starting index.
 *
 * Example 2:
 *
 * Input: gas = [2,3,4], cost = [3,4,3]
 * Output: -1
 * Explanation:
 * You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
 * Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
 * Travel to station 0. Your tank = 4 - 3 + 2 = 3
 * Travel to station 1. Your tank = 3 - 3 + 3 = 3
 * You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.
 * Therefore, you can't travel around the circuit once no matter where you start.
 *
 * Constraints:
 *
 * n == gas.length == cost.length
 * 1 <= n <= 105
 * 0 <= gas[i], cost[i] <= 104
 */
public class GasStation {

    /*
        - use a greedy strategy and variable 'totalSurplus' will accumulate the overall net gas balance across all stations
        - variable 'currentSurplus' will track the net gas balance for the current starting point
        - if the total surplus is negative, it's impossible to complete the circuit, so return -1
        - for each station calculate the difference between gas[i] and cost[i] (net gain/loss at each station)
        - add this difference to both 'totalSurplus' and 'currentSurplus'
        - if 'currentSurplus' drops below zero, it means we cannot reach the next station from the current starting point
        - reset 'currentSurplus' to zero and move the starting point to the next station (i + 1)
        - after the loop, check 'totalSurplus', if `totalSurplus` is non-negative, return `startingPoint` as the valid start
        - otherwise, return -1 since no solution exists
    */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int startingPoint = 0;

        for (int i = 0; i < gas.length; i++) {
            int difference = gas[i] - cost[i];

            totalSurplus += difference;
            currentSurplus += difference;

            if (currentSurplus < 0) {
                startingPoint = i + 1;
                currentSurplus = 0;
            }
        }

        return totalSurplus >= 0 ? startingPoint : -1;
    }
}
