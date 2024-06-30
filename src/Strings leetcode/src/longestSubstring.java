import java.util.HashMap;
import java.util.Hashtable;

public class longestSubstring {
    public static void main(String[] args) {
        System.out.println(LLS("abcdabcbb"));
    }
    public static int LLS(String s){
        int len = s.length();
        int ans = 0;
        HashMap<Character, Integer> hashtable = new HashMap<>();
        for(int i=0,j=0; j<len; j++){
            if(hashtable.containsKey(s.charAt(j))){
                i = Math.max(hashtable.get(s.charAt(j)),i);
            }
            ans = Math.max(ans, j-i+1);
            hashtable.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
