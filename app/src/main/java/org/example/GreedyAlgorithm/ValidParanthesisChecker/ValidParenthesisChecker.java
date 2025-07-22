package org.example.GreedyAlgorithm.ValidParanthesisChecker;

public class ValidParenthesisChecker {

    public static boolean isValidParenthesis(String s, int index, int count) {
        if(count < 0) return false;
        if(index == s.length()){
            return count == 0;
        }
        if(s.charAt(index) == '(') {
           return isValidParenthesis(s,index + 1, count +1);
        }
        if(s.charAt(index) == ')') {
            return isValidParenthesis(s,index + 1, count - 1);
        }
         return (isValidParenthesis(s, index + 1, count + 1) || isValidParenthesis(s, index+1, count-1) || isValidParenthesis(s, index + 1, count));
    }
}
