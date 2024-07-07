package org.leetcode.remove_duplicated_letters_316;


import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateAndLexicoSmaller(s));
    }


    private static String removeDuplicateAndLexicoSmaller(String s) {
        int[] lastIndex = new int[26];
        boolean[] used = new boolean[26];

        //pegando a ultima posição de cada letra
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        //verifica se stack ta vazio, se valor lexicografico é menor e se posição é menor
        //tira o stack até ser falso

        for (int i = 0; i < s.length(); i++) {
            char actualChar = s.charAt(i);

            //tirar caso encontre uma letra menor e seta como não usada
            while (!stack.isEmpty() && actualChar < stack.peek() && i < lastIndex[stack.peek() - 'a']) {
                used[stack.pop() - 'a'] = false;
            }

            if (!used[actualChar - 'a']) {
                stack.push(actualChar);
                used[actualChar - 'a'] = true;
            }

        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}
