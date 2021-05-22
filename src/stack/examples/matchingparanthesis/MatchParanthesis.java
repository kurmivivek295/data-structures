package stack.examples.matchingparanthesis;

import stack.Stack;

public class MatchParanthesis {
    public static void main(String[] args) {
        System.out.println(isMatchParen("(())"));
        System.out.println(isMatchParen("(())))"));
        System.out.println(isMatchParen("("));
        System.out.println(isMatchParen(")"));
    }

    private static boolean isMatchParen(String check1) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < check1.length(); i++) {
            char c = check1.charAt(i);
            if ( c == '(' ) {
                stack.push(c);
                continue;
            } else if (c == ')'){
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.size() > 0 ? false :true;
    }
}
