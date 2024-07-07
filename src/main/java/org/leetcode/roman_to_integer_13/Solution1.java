package org.leetcode.roman_to_integer_13;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.romanToInt("MCMXCIV");

    }

    private int romanToInt(String romanNumber) {
        int total = 0;
        for(int i = 0; i < romanNumber.length(); i++) {
            int actualValue = getValue(String.valueOf(romanNumber.charAt(i)));
            int nextValue = 0;
            if(i+1 < romanNumber.length()) {
            nextValue = getValue(String.valueOf(romanNumber.charAt(i+1)));
            }

            if(nextValue <= actualValue) {
            total += actualValue;
            }
            else {
            total += nextValue - actualValue;
            i++;
            }
        }
        return total;

    }


    private int getValue(String val) {
        return switch (val) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };

    }


}
