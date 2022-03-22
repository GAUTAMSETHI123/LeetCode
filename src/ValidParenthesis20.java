/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 22-03-2022
 *   Time: 23:52
 *   File: ValidParenthesis20.java
 */

import java.util.Stack;

public class ValidParenthesis20 {
    public static boolean isValidParenthesis(String s) {
        Stack<Character> bracket = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': bracket.push(c); break;
                case '{': bracket.push(c); break;
                case '[': bracket.push(c); break;
                case ')': if (bracket.empty() || bracket.peek()!='(') return false; else bracket.pop(); break;
                case '}': if (bracket.empty() || bracket.peek()!='{') return false; else bracket.pop(); break;
                case ']': if (bracket.empty() || bracket.peek()!='[') return false; else bracket.pop(); break;
                default:
            }
        }
        return bracket.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{}[)(]";
        boolean check = isValidParenthesis(s);
        if(check){
            System.out.println("The given string contains valid parentheses.");
        }
        else{
            System.out.println("The given string contains invalid parentheses.");
        }
    }
}

