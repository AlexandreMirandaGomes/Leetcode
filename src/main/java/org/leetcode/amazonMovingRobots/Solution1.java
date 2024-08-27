package org.leetcode.amazonMovingRobots;

public class Solution1 {

    public static void main(String[] args) {
        int[] previousPosition = {1,0,0,1};
        int[] position = {0, 1, 1, 0};
        System.out.println(isValidMove(previousPosition, position));
    }

    private static boolean isValidMove(int[] previousPosition, int[] position) {
        int numRobots = 0;
        int realNumRobots = 0;
        for(int i = 0; i < position.length; i++) {
            if( position[i] == 1) {
                numRobots ++;
                if(!((i > 0 && previousPosition[i-1] == 1)
                        || previousPosition[i] == 1
                        || (i + 1 <previousPosition.length && previousPosition[i+1] == 1))
                ) {
                    return false;
                }
            }
        }
        for(int i =0; i < previousPosition.length; i++) {
            if(previousPosition[i] == 1) {
                realNumRobots++;
            }
        }

        if(numRobots != realNumRobots) return false;

        return true;
    }

    private static boolean isInsideBoundary(int index, int length) {
        return index >= 0 || index < length;
    }
}
