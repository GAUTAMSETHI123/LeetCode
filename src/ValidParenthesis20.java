/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 22-03-2022
 *   Time: 23:52
 *   File: ValidParenthesis20.java
 */

import java.util.Stack;

public class ValidParenthesis20 {
    Stack<Character> bracket = new Stack<>();
        for (char c : s.toCharArray()) {
        switch (c) {
            case '(': bracket.push(c); break;
            case '{': bracket.push(c); break;
            case '[': bracket.push(c); break;
            case ')': if (bracket.empty() || bracket.peek()!='(') return false; else bracket.pop(); break;
            case '}': if (bracket.empty() || bracket.peek()!='{') return false; else bracket.pop(); break;
            case ']': if (bracket.empty() || bracket.peek()!='[') return false; else bracket.pop(); break;
            default: ;
        }
    }


        return bracket.isEmpty();
}
