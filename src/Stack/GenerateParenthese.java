package Stack;
import java.util.*;
public class GenerateParenthese {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        backTrack(result, "", 0, 0, n);
        return result;
    }

    public void backTrack(List<String> res, String currentStr, int open, int close, int max){
        if(currentStr.length()==max*2){
            res.add(currentStr);
            return;
        }
        if(open<max) backTrack(res, currentStr+"(", open+1, close, max);
        if(close<open) backTrack(res, currentStr+")", open, close+1, max);
    }
}