package Stack;

import java.util.*;
public class EvaluationOfReverseNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int val1 = stk.pop();
                int val2 = stk.pop();
                int res = val1 + val2;
                stk.push(res);
            } else if (token.equals("-")) {
                int val1 = stk.pop();
                int val2 = stk.pop();
                int res = val1 - val2;
                stk.push(res);
            } else if (token.equals("*")) {
                int val1 = stk.pop();
                int val2 = stk.pop();
                int res = val1 * val2;
                stk.push(res);
            } else if (token.equals("/")) {
                int val1 = stk.pop();
                int val2 = stk.pop();
                int res = val1 / val2;
                stk.push(res);
            } else {
                stk.push(Integer.valueOf(token));
            }
        }
        return stk.pop();
    }
}