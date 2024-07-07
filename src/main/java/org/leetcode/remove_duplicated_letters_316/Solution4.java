package org.leetcode.remove_duplicated_letters_316;


import java.util.Stack;

public class Solution4 {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateAndLexicoSmaller(s));
    }


    private static String removeDuplicateAndLexicoSmaller(String s) {
        //praticando uma ultima vez
        //antes de adicionar uma letra, precisa verificar se ela é lexicograficamente menor que a que está na stack e
        //alem disso, tem que verificar se a posição atual é menor do que a ultima posição da que está no topo da stack
        //isso garante que eu só retiro da stack o que realmente for se repetir la na frente (pois preciso ter as letras uma unica vez)
        //fora isso, se retirar alguma letra, precisa setar no used[] que ela não está mais sendo  usada e
        //se adicionar no stack, precisa botar no used[] como true

        int[] lastIndex = new int[26];
        boolean[] used = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char charSelected = s.charAt(i);

            while (!stack.isEmpty() && charSelected < stack.peek() && i < stack.peek()) {
                used[stack.pop() - 'a'] = false;
            }

            if (!used[charSelected - 'a']) {
                stack.push(charSelected);
                used[charSelected - 'a'] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();

    }
}
