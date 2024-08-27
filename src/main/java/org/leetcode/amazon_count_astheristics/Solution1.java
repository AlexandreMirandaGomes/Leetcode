package org.leetcode.amazon_count_astheristics;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        String s = "|*|*|**|*|*";
        List<Integer> startIndices = List.of(1,4);
        List<Integer> endIndices = List.of(3,8);

        System.out.println(countItemsBetweenPipes(s, startIndices, endIndices).toString());
    }

    private static List<Integer> countItemsBetweenPipes(String s, List<Integer> startIndices, List<Integer> endIndices) {
        List<Integer> resultList = new ArrayList<>();
        int count = 0;
        int result = 0;

        for(int z = 0; z < startIndices.size(); z++) {
            int startIndex = startIndices.get(z) - 1;
            int endIndex = endIndices.get(z) - 1;

            for(int i = startIndex ; i <= endIndex ; i++) {
                if(s.charAt(i) == '|') {
                    for(int j = i + 1; j <= endIndex; j++) {
                        if(s.charAt(j) == '*') {
                            count++;
                        }
                        else if(s.charAt(j) == '|') {
                            result += count;
                            count = 0;
                            i = j - 1;
                            break;
                        }
                    }
                }
            }
            resultList.add(result);
            result = 0;
        }
        
        return resultList;
    }
}
